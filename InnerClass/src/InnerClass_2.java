class A2{
    int a =3;
    int b =4;
    void abc(){
        System.out.println("A 클래스 메서드");
    }
    class B2{
        int a =5;
        int b =6;
        void abc(){
            System.out.println("B 클래스 메서드");
        }
        void bcd(){
            //이너클래스 본인의 멤버 사용
            System.out.println(a);
            System.out.println(b);

            //아우터 클래스의 멤버 사용
            System.out.println(A2.this.a);
            System.out.println(A2.this.b);
            A2.this.abc();
        }
    }
}

public class InnerClass_2 {
    public static void main(String[] args) {
        A2 a= new A2();
        A2.B2 b= a.new B2();
        b.bcd();
    }
}
