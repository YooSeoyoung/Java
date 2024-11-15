interface A{
    public abstract void abd();// 추상 메서드
}
class B implements A{ //인터페이스를 구현한 클래스
    @Override
    public void abd() {
        System.out.println("오버라이드");
    }
}
class C{
    void method(A a){ // A인터페이스의 구현체만 가지고 온다는 뜻
        a.abd();
    }
}

public class InnerClass_5 {
    public static void main(String[] args) {
        C c =new C();
        //C의 method()를 호출할때 매개변수로 A의 구현체를 전달하는 4가지 방법
        //1.
        A a =new B();// 구현클래스의 B의 생성자로 객체 생성( A로 업캐스팅)
        c.method(a);
        //2. 1번의 단순 버전
        c.method(new B());
        //3. 구현클래스의 인스턴스를 만들지 않고 인터페이스 A의 구현체를 만드는 방법
        A aa= new A(){
            @Override
            public void abd() {
                System.out.println("3.방법");
            }
        };
        c.method(aa);
        //4. 3번의 단순 버전
        c.method(new A(){
            @Override
            public void abd() {
                System.out.println("4.방법");
            }
        });
    }
}
