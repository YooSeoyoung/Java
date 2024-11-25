package GenericInheritance;


class Parent<T>{
     T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
//제네릭클래스를 상속한 자식클래스도 제네릭 클래스이다
//부모의 지네릭타입 변수를 그대로 물려받음
class Child<T> extends Parent<T>{
}
//만약 자식 클래스가 자신만의 제네릭타입 필드를 가진다면 ?
//제네릭타입을 선언부에 추가하면 됨!!
class Child2<T, V> extends Parent<T>{
    V v;

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
public class Generic_1 {
}
