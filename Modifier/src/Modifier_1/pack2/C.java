package Modifier_1.pack2;

import Modifier_1.pack1.A;// 동일 패키지가 아닌 것은 무조건 해줘야함(public 여부 관계 없이)

public class C {
    public void print(){
        A a =new A();
        System.out.print(a.a +" "); //다른 패키지여도 public이기 때문에 무조건 가능
//        System.out.print(a.b +" ");// 다른 패키지이기 때문에 사용 불가// 동일패키지가 아니므로(protected) 외부 패키지에서 접근 불가
//        System.out.print(a.c +" ");// 다른 패키지 이기 때문에 사용 불가( 상속도 안했음)// 동일패키지가 아니므로(default) 외부 패키지에서 접근 불가
//        System.out.print(a.d +" "); //private이기 때문에 무조건 안됨( 동일 클래스만 가능하기 때문에)
        System.out.println();
    }
}
