public class Static_Method {
    public static void main(String[] args) {
       //1. 인스턴스 메서드 / 객체생성(인스턴스화)
        A a1 =new A();
        a1.abc();// 10 20
        //2.정적 메서드/객체 생성 없이 클래스명.메서드명
        A.bcd(); // 20
        A a2 = new A();
        a2.bcd(); //20 // 인스턴세 메서드처럼 사용이 가능하나 권장하지 않음
    }
}
class A{
    int a;// 인스턴스 필드
    static int b;//정적 필드
    void abc(){ //인스턴스 메서드
        a=10;
        b=20;
        System.out.println(a+" "+b);
    }
    static void bcd(){ //정적 메서드(=static메서드)
         //중요!!! 정적메서드에서는 인스턴스필드 또는 인스턴스 메서드를 참조 X(사용할 수 없다) / 즉, 참조가 불가능 ( 주소값을 확인 할 수가 없다)
        // a=10; // 사용을 할려면 필드 상에 있는 int a는 static으로 만들어야됨
        b=20;
        System.out.println(b);
    }
}
