package Interface;

interface D1{
    void abc();
    public default void bcd(){ // 접근지정자는 public이고 default는 아님(하나의 용어)
        System.out.println("인터페이스의 D1의 디폴트 메서드");
    }
}
class D2 implements D1{
    @Override
    public void abc() {//추상메서드 abc는 오버라이딩 필수

    }
}//!!!!!!!!!!!디폴트 메서드 bcd는 오버라이딩 할 필요가 없음
class D3 implements D1{
    @Override
    public void abc() { //추상메서드 abc는 오버라이딩 필수

    }

    @Override
    public void bcd() { //디폴트 메서드 bcd는 오버라이드도 가능하다
        D1.super.bcd();
    }
}
// 디폴트 메서드는 기존 인터페이스를 수정 업데이트를 해도 기존 구현 클래스를 수정할 필요 없도록 기본 구현을 제공할 수 있는 메서드
// 추상메서드와 달리 구현내용을 가지고 있는 메서드임( 자바 8버전에서 새로 등장)
public class Interface_5 {
}
