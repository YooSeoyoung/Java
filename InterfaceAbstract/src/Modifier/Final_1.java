package Modifier;

class A1{
    int a=3;
    final int b =5; //final을 필드에 적용 가능, 선언과 함께 즉시 초기화
    A1(){}
}
class A2{
    int a;
    final int b; //선언과 초기화 분리
    A2(){ a=3; b=5;} //final은 값이 없으면 절대 안된다( 필수적으로 초기화 -> 안하면 에러 발생!!!)
}
class A3{
    int a =3;
    final int  b=5;
    A3(){ a=5;
        //b=5;  -> final은 생성자에서도 값을 변경할 수 없음 ( 초기화가 된  다음에는)
    }
}
class B{
    void bcd(){
        int a =3; final int b=5; a=7; // final은 지역변수에도 사용이 가능하다.
        //b=9;
    }
}
public class Final_1 {
    public static void main(String[] args) {
        //객체 생성
        A1 a1 =new A1();
        A2 a2 =new A2();
        A3 a3 =new A3();
        a1.a=10;
        //a1.b =11; -> final 필드에 정해진 값 변동 불가
        a2.a=100;
       // a2.b =100;// -> final 필드에 정해진 값 변동 불가
        System.out.println(a1.a);//10
        System.out.println(a1.b);//5
        System.out.println(a2.b);//100
        System.out.println(a2.b);//5

    }
}
