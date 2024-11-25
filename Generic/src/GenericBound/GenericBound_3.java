package GenericBound;

class A3{}
class B3 extends A3{}
class C3 extends B3{}
class D3 extends C3{}

class Goods<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

 class Test{
    void method1(Goods<A3> g) {}
     void method2(Goods<?> g) {}
     void method3(Goods<? extends B3> g) {}
     void method4(Goods<? super B3> g) {}

 }

public class GenericBound_3 {
    public static void main(String[] args) {
        Test t =new Test();
        //void method1(Goods<A3> g) {} 의 경우
        t.method1(new Goods<A3>());
        //t.method1(new Goods<B3>()); // 불가능(Goods<A3>만 가능
        //t.method1(new Goods<C3>()); // 불가능(Goods<A3>만 가능
        //t.method1(new Goods<D3>()); // 불가능(Goods<A3>만 가능

        //void method2(Goods<?> g) {} 의 경우(와일드 카드)
        t.method2(new Goods<A3>());
        t.method2(new Goods<B3>());
        t.method2(new Goods<C3>());
        t.method2(new Goods<D3>());

        //void method3(Goods<? extends B3> g) {}의 경우
        // B3클래스와 자식 클래스만 허용
        //t.method3(new Goods<A3>()); // 상한제한이기 때문에 B3 클래스의 부모 클래스인 A3 로는 불가능
        t.method3(new Goods<B3>());
        t.method3(new Goods<C3>());
        t.method3(new Goods<D3>());

        //void method4(Goods<? super B3> g) {}
        // B3클래스와 부모 클래스만 허용
        t.method4(new Goods<A3>());
        t.method4(new Goods<B3>());
        //t.method4(new Goods<C3>()); // 하한 제한이기 때문에 B3클래스의 자식 클래스는 불가능
        //t.method4(new Goods<D3>()); // 하한 제한이기 때문에 B3클래스의 자식 클래스는 불가능
    }

}
