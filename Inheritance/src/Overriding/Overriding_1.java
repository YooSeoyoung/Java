package Overriding;
// 메서드 오버라이딩
class A{
    int a=5;
    void print(){
        System.out.println("A 클래스 " +a);
    }
}
class B extends A{
    int a=10;
    void print(){
        System.out.println("B 클래스 "+ a);
    }
}
public class Overriding_1 {
    public static void main(String[] args) {

        A value1 = new A();
        value1.print(); //A클래스 5

        B value2 = new B();
        value2.print(); //B클래스 10

        A value3 = new B(); // B를 A로 업캐스팅
        value3.print(); // B클래스 10
        //A클래스의 print 메서드가 자식 클래스의 print로 오버라이딩 되었기 때문
        // 동적 바인딩 발생 / 같은 이름일 경우 부모가 참조하는 메서드가 자식이 참조하는 메서드로 포인트를 바꿈
        // 오버라이딩은 메서드에만 적용 / 필드 영역은 해당 x ( 필드는 정적 영역)
        System.out.println(value3.a);//5

        B value4= (B)value3; //A->B 다운캐스팅
        System.out.println(value4.a); //10
        value4.print();//B클래스 10


    }

}
