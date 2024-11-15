package Modifier_1.pack2;

import Modifier_1.pack1.A;

public class D extends A { //다른 패키지에 있는 클래스 A를 상속한다 (임포트 필수)
    //A클래스에 있는 필드를 사용 ( 따로 별도의 필드 생성을 안해도 )
    public void print(){
        System.out.print(a+" "); //public
        System.out.print(b+" "); //protected // 상속을 하였기 때문에 다른 패키지에 있는 클래스도 엑세스 가능
//        System.out.print(c+" "); //default // 상속 개념이 없기 때문에
//        System.out.print(d+" "); //private //상속을 한다고 해도 접근 불가
    }
    }
