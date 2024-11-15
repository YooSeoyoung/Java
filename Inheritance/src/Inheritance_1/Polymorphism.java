package Inheritance_1;
// 단순한 상속관계
class A{}
class B extends A{}//A에게 상속
class C extends B{}//B,A에게 상속
class D extends B{}//B,A에게 상속
//다형성
public class Polymorphism {
    public static void main(String[] args) {
        //!!!!! 인스턴스의 타입은 생성장의 의해 결정 된다!!!!!!!
        //대입 연산자 왼쪽의 타입은 상속관계에 의해 부모 클래스일 수 있다.
        //A타입의 다형적 표현
        A a1= new A(); //A는 A이다
        A a2= new B(); //B는 A이다(업캐스팅)
        A a3 =new C(); //C는 A이다(업캐스팅)
        A a4= new D(); //D는 A이다(업캐스팅)

        //B타입의 다형적 표현
        //B b1=new A(); //A는 B이다 (잘못된 명제)/ 다운캐스팅(에러)
        B b2=new B();
        B b3=new C();
        B b4=new D();

        //C타입의 다형적 표현
        //C c1= new A(); //A는 C이다
        //C c2= new B(); //B는 C이다
        C c3= new C();
       // C c4= new D(); //D는 C이다(서로 상속 관계 X)

        //D타입의 다형적 표현
        //D d1= new A(); //A는 D이다
        //D d2= new B(); //B는 D이다
        //D d3= new C(); //C는 D이다(서로 상속 관계 X)
         D d4= new D();

         //타입 캐스팅
        A ac = new C(); // C는 A 업캐스팅
        B bc= new C();// C는 B 업캐스팅
        B bb = new B();
        A a=(A)bb; //B를 A 업캐스팅의 다른 방법

        //다운 캐스팅
        // 가능한 경우와 불가능한 경우가 있음
        // 생성자에 의해 원래 타입이 결정되므로 부모로 업캐스팅된 후 다시 원래 타입으로 돌아오는 다운 캐스팅은 가능함
        B bbb= new B();//  원래는 B타입 B()로 생성했으므로
        A aaa= (A)bbb; // 부모 클래스인 A타입으로 업캐스팅
        B bbb1=(B)aaa;// 원래 B타입으로 돌아오는 다운캐스팅

        A aa = new A();
        //B b=(B)aa; // 다운 캐스팅 불가
        //C c =(C)aa;// 다운 캐스팅 불가

        A ad= new D();// 원래 타입은 D인데 A로 업캐스팅
        B db= (B)ad; //A는 B로 다운캐스팅 ( 가능함, D는 B이기 때문에)
        D dd = (D)ad;// A->D로 다운캐스팅 ( 가능함, 원래 타입이 D이기 때문에)


    }
}
