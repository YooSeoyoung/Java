package Abstract;

abstract class A{
    abstract void abc(); // 아직 메모리에 만들어지지 않았음
}

//추상클래스의 객체 생성
// 원래 추상클래스는 그 자체로 인스턴스를 생성할 수 없음(자식 클래스 이용)
// 근데, 익명이너클래스를 이용하하면 가능함
public class Abstract_3 {
    public static void main(String[] args) {
        //외부에 A클래스를 상속받아 오버라이드를 구현해야하나, 인스턴스를 한번만 사용할 목적으로 아래와 같이 익명이너클래스 사용 가능
        A a1= new A(){
            @Override
            void abc() {
                System.out.println("익명이너클래스로 객체 생성");
            }
        };
        a1.abc();
        //단점 , a1말고 다른 인스턴스를 생성하려면 다시 익명이너클래스는 이용해야함
        A a2 = new A() {
            @Override
            void abc() {
                System.out.println("익명이너클래스 다시 생성");
            }
        };
        a2.abc();
    }
}

