package GenericClass;
//제네릭 문법의 등장
//T는 MyClass 안에 T라는 제네릭 타입이 사용되었음을 알리는 표시
//보통 필드나 메서드의 매개변수에 T타입을 명시해서 사용함
//반드시 T여야하는 것은 아니고 어떤 문자던 상관없음(대신 클래스 내 동일 문자가 사용되야함)
//일반적인 사용되는 문자
//T(type), E (Element), K(Key), V(Value), N(Number) 등등
class MyClass<T>{
    private T t;
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class Generic_3 {
    public static void main(String[] args) {
        // 제네릭 타입 T는 객체 생성 시점에 결정되어야함
        MyClass<String> mc1= new MyClass<>();
        mc1.setT("Hello");

        MyClass<Integer> mc2 = new MyClass<Integer>();
        mc2.setT(100);
        //mc2.setT("Hello"); // 컴파일 에러
        // 제네릭 타입은 강한 타입체크를 수행하므로 타입을 잘못 사용하면 즉시 에러!!!!
    }

}
