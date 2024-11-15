package TypeCasting;

class A{
    int a=3;
    void methodA(){
        System.out.println("A 클래스");
    }
}
class B extends A{
    int b=4;
    void methodB(){
        System.out.println("B 클래스");
    }
}

public class TypeCasting_1 {
    public static void main(String[] args) {
        //A타입
        A value1 = new A();
        System.out.println(value1.a);//3
        value1.methodA();//A 클래스

        //B타입
        B value2 = new B();
        System.out.println(value2.a);//3
        System.out.println(value2.b);//4
        value2.methodA(); //A 클래스
        value2.methodB();//B 클래스

        //타입 캐스팅 B->A로 업캐스팅
        A value3 = new B(); //B 속에 있는 A를 참조
        System.out.println(value3.a);//3
        value3.methodA();//A 클래스

        B value4=(B)value3; //A를 B로 다운캐스팅 (다시 B의 주소값을 참조) //B는A의 자식이니까 A의 인스턴스도 사용 가능
        System.out.println(value4.b);
        value4.methodB();
        System.out.println(value4.a);
        value4.methodA();

    }
}
