package P1029;

public class User {
    //필드
    String username;
    String email;
    String password;
    //생성자 : 필드 영역을 초기화 하는 역할
    //기본 생성자
    public User() {
    }
    //매개변수가 있는 생성자
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    //메서드
    // 패스워드 변경 //void로 해도 상관 없음
    public String setPassword(String newPassword){
        this.password =newPassword;
        return this.password;
    }
}
