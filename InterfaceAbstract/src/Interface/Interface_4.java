package Interface;

//2. 익명 이너클래스를 이용하는 객체 생성

interface C1{
    int a =3;
    void abc();
}
public class Interface_4 {
    public static void main(String[] args) {
        C1 value1 = new C1() {
            @Override
            public void abc() {
                System.out.println("익명이너클래스를 이용한 인터페이스 객체 생성");
            }
        };
        value1.abc(); //익명 이너클래스를 이용한 인터페이스 객체 생성하여 메서드 호출
    }
}
