package P1031;

public class Constructor1 {
    public static void main(String[] args) {
        A a =new A();//클래스 A(참조 자료형)
                     // a = 클래스 A의 변수 인데 스택에 만들어지고/ 클래스A의 인스턴스
                     // new=인스턴스화하기 위한 키워드 (힙에다가 메모리 생성)
                     // A()-> 생성자(매개변수가 없는 생성자는 기본생성자) -> 초기화를 하지 않고 메모리만 생성
        a.work(); // A클래스의 a 인스턴스의 메서드 호출
        B b=new B();
        b.work();
       // C c=new C();-> 기본생성자를 만들지 않고 매개변수가 있는 생성자를 만들었기 때문에 오류 발생
        C c=new C(3);
        c.work();//3

    }
}
class A{
    int m;
    void work(){
        System.out.println(m);
        // 기본생성자를 만들지 않으면 자바가 자동으로 기본 생성자 생성
    }
}
class B{
    int m;
    void work(){
        System.out.println(m);
    }
    B(){//기본 생성자를 직접 정의
        System.out.println("B의 기본생성자");
        //기본생성자를 만들면 그 만들어져있는 생성자를 사용!!
    }
}
class C{
    int m;
    void work(){
        System.out.println(m);
    }
    C(int a){// 기본생성자가 아닌 매개변수가 있는 생성자만 만듬
        m=a;
    }
    //!!!!클래스 내에 생성자가 없으면 기본 생성자 자동 생성
    //  생성자가 있으면 (어떤 것이든 상관없이) 기본 생성자가 자동 생성 안됨!!!
    // == 생성자를 만들었으면 그 생성자를 사용해야함
}
