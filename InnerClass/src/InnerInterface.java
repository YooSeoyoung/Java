class C1{
    //이너 인터페이스(클래스 안에 선언된 인터페이스 / 접근을 하려면 클래스명.인터페이스명 형식으로만 가능함)
    interface D{
        public abstract void method1();
    }
}
class C2 implements C1.D{
    @Override
    public void method1() {
        System.out.println("이너인터페이스의 구현 클래스");
    }
}
public class InnerInterface {
    public static void main(String[] args) {
        // 이너인터페이스의 객체 생성 방법
        //1. 구현 클래스 이용
        C1.D value1= new C2();
        value1.method1();
        //2. 익명이너클래스
        C1.D value2= new C1.D() {
            @Override
            public void method1() {
                System.out.println("익명이너클래스로 객체 생성");
            }
        };
        value2.method1();

    }
}
