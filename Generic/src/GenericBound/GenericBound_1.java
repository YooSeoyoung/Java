package GenericBound;
class A{}
class B extends A{}
class C extends B{}

//제네릭 타입 T의 범위를 제한하는 방법
//T는 B를  상속하기 때문에 T의 자리에 B와 B의 자식클래스(C클래스)만 올 수 있음
class D <T extends B>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class GenericBound_1 {
    public static void main(String[] args) {
        //D<A> d1 =new D<>();  //T extends B이므로 A는 올 수 없음
        D<B> d2 =new D<>();
        D<C> d3 =new D<>();

        d2.setT(new B());
        d2.setT(new C()); //C는 B이므로 가능

        //d3.setT(new B()); // B는 C가 아니므로 가능( 다운 캐스팅 x)
        d3.setT(new C());

    }
}
