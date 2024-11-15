package Interface;
//일반 클래스
class MyClass{}

// 인터페이스 A,B
interface A{}
interface B{}

//인터페이스 A를 상속하는 클래스C
class C implements A{} // 단일 인터페이스 상속

//인터페이스 A,B를 상속하는 클래스D
class D implements A,B{} // 다중 인터페이스 상속

// 클래스는 E는 MyClass 클래스를 상속하고 인터페이스 A,B를 상속
// 클래스는 상속은 1개만 가능하고 인터페이스 상속은 다중 상속이 가능하고 클래스상속과 인터페이스 상속을 같이 사용할 수 있다.
class E extends MyClass implements A,B{}



public class Interface_1 {
    public static void main(String[] args) {

    }
}
