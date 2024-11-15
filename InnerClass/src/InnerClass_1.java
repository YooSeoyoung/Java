 // 아우터 클래스(외부 클래스)
class A1{
    public int a =3;
    protected  int b=4;
    int c =5;
    private int d =6;
    void abc(){
        System.out.println("A1 클래스 메서드 abc()");
    }
    //이너 클래스(내부 클래스)
    class B1{
        void bcd(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            abc();
        }
    }
}

public class InnerClass_1 {
    public static void main(String[] args) {
        A1 a1= new A1(); // 아우터 클래스의 객체 생성
       // B1 b1= new B1(); // 이너클래스는 아우터 클래스 없이 접근 불가
        A1.B1 b = a1.new B1(); // 이너클래스의 객체 생성( B1 b1= new B1();==> 단독 사용 불가 )//B1를 자바 컴파일러 자체를 확인 할 수 없음
        b.bcd();
        // 이너클래스는 아우터 클래스의 모든 멤버 접근 가능
    }
}
