import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlJdbcExample_2 {

    // 1. 데이터베이스 커넥션 정보(상수로 선언)
    private static final String URL = "jdbc:mysql://localhost:3306/testdb"; //로컬PC에 있는 데이터베이스 주소
    // jdbc:mysql: => 보낼 주소 ,//localhost:3306/testdb => 참조할 주소(다른 pc꺼이면 ip 주소 등 사용)
    // 위 주소로 로그인할 때 필요한 아이디랑 패스워드(상수로 선언)
    private static final String USER="root"; // 아이디
    private static final String PASSWORD="root"; //패스워드

    //2. INSERT
    // 부서테이블에 새로운 행 추가(동적으로 행 추가)
    public void insertDepartment(String deptNo, String deptName){
        String query = "insert into 부서(부서번호, 부서명) values(?, ?)"; // ? => 플레이스 홀더 (? 자리에 매개변수를 넣을 예정)
        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)){ // int를 리턴(가서 작업한 행의 개수)// -> 쿼리 구문을 완성시키는 구문(동적 바인딩을 사용하기 위함)
            // 장점 : 조금 더 보안적인 측면을 고려(쿼리 따로 값 따로 보냄)
            preparedStatement.setString(1,deptNo); // -> 인덱스 번호 입력(mysql은 0번 인덱스가 없기 때문에 1번)
            preparedStatement.setString(2,deptName); // -> 인덱스 번호 입력(mysql은 0번 인덱스가 없기 때문에 2번)
            preparedStatement.executeUpdate();
            System.out.println("Insert 성공");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    //3.UPDATE
    public void updateDepartment(String oldName, String newName){
        String query = "update 부서 set 부서명=? where 부서명=?";
        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)){ // -> 쿼리 구문을 완성시키는 구문(동적 바인딩을 사용하기 위함)
            // 장점 : 조금 더 보안적인 측면을 고려(쿼리 따로 값 따로 보냄)
            preparedStatement.setString(1,newName); // 첫번째 물음표에는 뭐
            preparedStatement.setString(2,oldName); // 두번째 물음표에는 뭐
            preparedStatement.executeUpdate();
            System.out.println("update 성공");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /*
    Statement와 PreparedStatement 차이점
    1. SQL Injection 취약성 : 끼어들어서 값을 바꿔버린다(매개변수로 넣은 값을 하나의 쿼리로 보기 때문에 매개변수에 악의적으로 쿼리 값을 작성을 하게 될 경우 발생할 수 있는 에러)
    S : 매우 취약    P: 안전
    2. 캐싱 :  어떤 데이터를 한 번 받아온 후에 그 데이터를 불러온 저장소보다 가까운 곳에 임시로 자정하여 필요하면 더 빠르게 불러와서 사용
    S : 항상 새로운 쿼리 실행  P:동일한 쿼리는 캐싱하여 성능 향상
    3. 가독성 :
    S :  코드가 복잡하면 알아보기 어려움    P : 가독상이 향상됨
     */

    // 제품테이블에 insert 제품번호 : 93번 제품명 : 새우깡  포장단위: 500g pkgs. 단가 :2000 재고 :100

    public void insertProduct(int productNumber, String name, String unit , double price , int stock){
        String query = "insert into 제품(제품번호, 제품명, 포장단위, 단가, 재고) values(?,?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement preparedStatement= connection.prepareStatement(query)){
            preparedStatement.setInt(1,productNumber);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,unit);
            preparedStatement.setDouble(4,price);
            preparedStatement.setInt(5,stock);
            preparedStatement.executeUpdate();
            System.out.println("INSERT 성공");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MysqlJdbcExample_2 repository = new MysqlJdbcExample_2();
//        repository.insertDepartment("A6","총무부");
//        repository.insertDepartment("A7","해외영업부");

//        repository.updateDepartment("해외영업부","글로벌영업부");
        repository.insertProduct(93,"새우깡","500 g pkgs.",2000,100);

    }

}
