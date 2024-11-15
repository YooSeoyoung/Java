package Modifier_1.pack1;

public class B {
    public void print(){
        A a =new A(); //임포트를 할 필요가 없음( 같은 패키지 안에 있기 때문에)
        System.out.print(a.a +" ");
        System.out.print(a.b +" ");
        System.out.print(a.c +" ");
        //System.out.print(a.d +" "); //private는 동일 클래스에서만 가능하기 때문에 동일 패키지라도 다른 클래스에서는 접근이 불가능하다
        System.out.println();
    }
}
