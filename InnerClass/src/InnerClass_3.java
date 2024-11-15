class A3{
    int a =3;
    static int b =4;
    void method1(){
        System.out.println("instance method");
    }
    static void method2(){
        System.out.println("static method");
    }
    static class B3{
        static void bcd(){ // 메서드에 static이 붙었을때는 클래스에 static이 붙어있는지 여부랑 상관없이 바로 호출 가능
            // 인스턴스 필드와 인스턴스 메서드는 A3클래스가 메모리에 생성되어야 만들어지는 멤버이므로 A3클래스의 인스턴스없이 참조 불가능
            //System.out.println(a); // 아우터 클래스의 인스턴스 필드는 스태틱 이너 클래스에서 사용 불가능
            System.out.println(b);
            //method1(); // 아우터 클래스의 인스턴스 메서드는 스태틱 이너 클래스에서 사용 불가능
            method2();
        }
    }
}
public class InnerClass_3 {
    public static void main(String[] args) {
        A3.B3.bcd(); // 정적 메서드는 별도의 객체 생성 없이 호출 가능함 (대신 이너클래스이기 때문에 아우터클래스명.이너클래스명.메서드명() 으로 호출)
        // 이너 클래스에 static이 안 붙어있을 경우
        // A3 a= new A3(); -> A3.B3 b = a.new B3();
        //이너 클래스에 static이 붙으면
        // A3 a =new A3()이 필요 X/ A3.B3 b = new A3.B3();

        //B3 이너클래스를 static으로 선언한 의미는 A3의 다른 정적멤버들과 마찬가지로 A3의 인스턴스없이 사용  가능하다는 것
        //A3클래스의 인스턴스를 만들 필요 없이 B3의 인스턴스 생성 가능

        A3.B3 b = new A3.B3();
    }
}
