package ObjectClass;

class C{
    String name;
    C(){};
    C(String name){ this.name=name;}
}
class D{
    String name;
    D(){}
    D(String name){this.name=name;}

    @Override
    public boolean equals(Object obj) {
        return this.name==((D)obj).name ? true:false; //name이라는 필드가 같으면 ~~
    }
}
public class Object_3 {
    public static void main(String[] args) {
        //Object 클래스의 equals메서드와 오버라이드한 메서드의 차이 예제
        C c1 =new C("Hello");
        C c2 =new C("Hello");
        System.out.println(c1==c2); // 메모리 위치 자체가 다르기 때문에  스택에 있는 참조값이 다르기 때문에 false
        System.out.println(c1.equals(c2)); // 똑같은 비교 연산자를 사용 (false) //클래스의 equals는 비교 연산자 ==> 개발자가 오버라이딩을 해야됨

        D d1= new D("Hello");
        D d2 =new D("Hello");
        System.out.println(d1==d2); //false // 메모리 위치 자체가 다르기 때문에  스택에 있는 참조값이 다르기 때문에
        System.out.println(d1.equals(d2)); //true /Object의 equals메서드를 오버라이딩을 해서 name 필드의 비교
    }
}
