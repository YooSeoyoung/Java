import java.sql.*; // 임포트를 사용하여 jdbc 라이브러리 사용 (외부 라이브러리)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlJdbcExample {
    // 1. 데이터베이스 커넥션 정보(상수로 선언)
    private static final String URL = "jdbc:mysql://localhost:3306/testdb"; //로컬PC에 있는 데이터베이스 주소
    // jdbc:mysql: => 보낼 주소 ,//localhost:3306/testdb => 참조할 주소(다른 pc꺼이면 ip 주소 등 사용)
    // 위 주소로 로그인할 때 필요한 아이디랑 패스워드(상수로 선언)
    private static final String USER="root"; // 아이디
    private static final String PASSWORD="root"; //패스워드
    //2. 원하는 정보를 조회하기 위한 메서드를 정의 : 모든 고객정보를 조회
    public List<Customer> getAllCustomers(){
        List<Customer> customers = new ArrayList<>();
        //SQl 쿼리 작성
        String query = "select * from 고객";
        //jdbc에서 지원하는 함수
        // 예외처리 필요( 외부에 있는 데이터베이스 연결하는 과정은 반드시 예외처리 필요)
        // try~catch라는 문법을 사용
        // try() 를 실행하고 오류가 발생하면 catch구문을 실행하라는 문범
        try (
        Connection connection =DriverManager.getConnection(URL,USER,PASSWORD); // -> 커넥션을 맺기
        Statement statement = connection.createStatement(); // 커넥센의 메서드 ( 쿼리를 전달해주는 역할)
        ResultSet resultSet = statement.executeQuery(query); // 쿼리를 실행시켜주는 역할을 하는 클래스 인스턴스(결과 데이터를 담을 수 있는 클래스)
        ) { //==> 조회할 때 사용
            System.out.println("데이터베이스 연결 성공");
            //조회결과는 resultSet에 담겨있음
            // resultSet으로부터 데이터를 꺼내서 Customer 클래스의 인스턴스에 저장
            // 생성된 인스턴스들은 List<Customer>에 추가해야함
            while (resultSet.next()){ // 다음에 불러올게 없을때 까지 작동( 다음에 불러올게 없으면 자동으로 false리턴하여 멈춤)
                Customer customer =new Customer();
                customer.setCustomerId(resultSet.getString("고객번호"));
                customer.setCompanyName(resultSet.getString("고객회사명"));
                customer.setContactName(resultSet.getString("담당자명"));
                customer.setContactTitle(resultSet.getString("담당자직위"));
                customer.setAddress(resultSet.getString("주소"));
                customer.setCity(resultSet.getString("도시"));
                customer.setRegion(resultSet.getString("지역"));
                customer.setPhone(resultSet.getString("전화번호"));
                customer.setMileage(resultSet.getInt("마일리지"));

                customers.add(customer);
            }
        }  catch(SQLException e){
            e.printStackTrace();// 예외가 발생하는 과정의 정보를 출력
    }
        return customers;
    }

    //3. 원하는 정보를 조회하기 위한 메서드를 정의 : 모든 부서정보를 조회
    public List<Department> getAllDepartment(){
        List<Department> departments= new ArrayList<>();
        String query1="select * from 부서";

        try ( Connection connection =DriverManager.getConnection(URL,USER,PASSWORD); // -> 커넥션을 맺기
              Statement statement = connection.createStatement(); // 커넥센의 메서드 ( 쿼리를 전달해주는 역할)
              ResultSet resultSet = statement.executeQuery(query1); ){ // 쿼리를 실행시켜주는 역할을 하는 클래스 인스턴스(결과 데이터를 담을 수 있는 클래스)
            while (resultSet.next()){
                Department department = new Department();
                department.setDepartmentId(resultSet.getString("부서번호"));
                department.setDepartmentName(resultSet.getString("부서명"));

                departments.add(department);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return  departments;
    }

    //4. 조인 쿼리를 사용하는 메서드 정의
    // 이름, 입사일, 부서명 조회
    //조인테이블로 결합된 정보가 조회되므로 기존 클래스에 저장 불가

    public void getEmployees_1(){
        // 1. resultset의 정보를 그대로 사용함 : 따로 저장하지 못하기 때문에 재사용성 떨어짐
        String query = "select 이름,입사일,부서명 from 사원 " +
                "inner join 부서 on 사원.부서번호 = 부서.부서번호";

        try(Connection connection =DriverManager.getConnection(URL,USER,PASSWORD); // -> 커넥션을 맺기
            Statement statement = connection.createStatement(); // 커넥센의 메서드 ( 쿼리를 전달해주는 역할)
            ResultSet resultSet = statement.executeQuery(query)){
            while (resultSet.next()) {
                String name = resultSet.getString("이름");
                String date = resultSet.getString("입사일");
                String dept = resultSet.getString("부서명");
                System.out.println(name + " " + date + " " + dept);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void getEmployees_2(){
        // 2. Map으로 동적 데이터 처리 : 쿼리 결과의 구조가 자바 클래스와 일치하지 않고 재사용 예정이라면 데이터를 map구조(key, value)로 저장할 수 있음
        String query = "select 이름,입사일,부서명 from 사원 " +
                "inner join 부서 on 사원.부서번호 = 부서.부서번호";
        List<Map<String, Object>> employees = new ArrayList<>(); // map 형태로 만들어서 arraylist에 담겠다는 의미 ,, object인 이유는 resultset의 결과(다양한 형태의 데이터 타입을 받을 수 있기 때문에)

        try(Connection connection =DriverManager.getConnection(URL,USER,PASSWORD); // -> 커넥션을 맺기
            Statement statement = connection.createStatement(); // 커넥센의 메서드 ( 쿼리를 전달해주는 역할)
            ResultSet resultSet = statement.executeQuery(query)){
            while(resultSet.next()){
                Map<String,Object> employee = new HashMap<>();
                employee.put("이름",resultSet.getString("이름"));
                employee.put("입사일",resultSet.getString("입사일"));
                employee.put("부서명",resultSet.getString("부서명"));
                employees.add(employee);
            }
            for (Map<String,Object> employee : employees){
                System.out.println(employee);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //5. 주문기록이 없는 고객의 고객번호와 고객회사명 조회
    public void getCustomersNotOrder(){
        String query ="select 고객.고객번호, 고객회사명, 주문번호 from 고객 left outer join 주문 on 고객.고객번호 = 주문.고객번호 where 주문.주문번호 is null";
        try(Connection connection =DriverManager.getConnection(URL,USER,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)){
            while (resultSet.next()){
                String Id = resultSet.getString("고객.고객번호");
                String name =resultSet.getString("고객회사명");
                System.out.println(Id + " , "+ name);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
    public void getCustomersNotOrder_1(){
        String query ="select 고객.고객번호, 고객.고객회사명 from 고객 where 고객번호 not in(select 주문.고객번호 from 주문)";
        List<Map<String,Object>> customers = new ArrayList<>();

        // 리소스를 사용한다(힙에 메모리가 할당되는 코드)
        try(Connection connection =DriverManager.getConnection(URL,USER,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)){
            while (resultSet.next()){
                Map<String,Object> customer = new HashMap<>();
                customer.put("고객번호", resultSet.getString("고객번호"));
                customer.put("고객회사명", resultSet.getString("고객회사명"));
                customers.add(customer);
            }
            for (Map<String,Object> customer : customers){
                System.out.println(customer);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        MysqlJdbcExample repository = new MysqlJdbcExample(); // 클래스 인스턴스화
//        List<Customer> customers=repository.getAllCustomers();
//
//        System.out.println(customers.size());
//        for (Customer customer:customers){
//            System.out.println(customer);
//        }
//        List<Department> departments = repository.getAllDepartment();
//        System.out.println(departments.size());
//        for (Department department:departments){
//            System.out.println(department);
//        }
//        repository.getEmployees_1();
//        repository.getEmployees_2();
        repository.getCustomersNotOrder();
//        repository.getCustomersNotOrder_1();

    }
}
