package Super1;

class A{
    void abc(){
        System.out.println("A클래스");
    }
}
class B extends A{
    @Override
    void abc() { //오버라이딩
        System.out.println("B클래스 abc");
    }

    void bcd(){
        //System.out.println("B클래스 bcd");
        abc();// 아무것도 지정하지 않으면 this(즉 자기 객체/ 자기 생성자 ) == this.abc()
        super.abc();// 부모의 abc사용(즉, 부모의 인스턴스를 의미한다 ) // 클래스 밖에는 불가능 ( 즉, main 클래스 등 )
    }
}

public class Super1 {
    public static void main(String[] args) {
        B value1= new B();
        value1.abc(); //B클래스 abc
        value1.bcd(); //B클래스  bcd
        A value2 = (A)value1;//업캐스팅
        value2.abc(); //B클래스 abc
        //value2.bcd(); //에러 발생 A를 바인딩(참조)하고 있으므로 B영역에 있는 bcd메서드는 호출이 불가능

    }
}
