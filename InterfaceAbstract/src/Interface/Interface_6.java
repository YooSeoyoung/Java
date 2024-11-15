package Interface;

interface S{
    static void abc(){
        System.out.println("S 인터페이스의 정적(스태틱) 메서드");
    }
}
//스태틱 메서드는 디폴트메서드처럼 기존 인터페이스에 추가하더라도 구현클래스들에 영향을 미치지 않는 점은 동일함
public class Interface_6 {
    public static void main(String[] args) {
        S.abc(); // 정적 메서드이므로 인스턴스 없이 호출 가능
    }
}
