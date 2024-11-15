package Modifier_2;

import Modifier_2.pack.AA;
//import Modifier_2.pack.BB;//default 클래스 , 임포트 불가
import Modifier_2.pack.CC;// public 클래스여서 임포트는 가능

public class Modifier_2 {
    public static void main(String[] args) {
        //AA, CC, BB 클래스 인스턴스화
        AA a =new AA();
        //BB b =new BB();//default라서 에러 발생(동일 패키지가 아니기 때문에 인스턴스화 불가)
        //CC c =new CC(); //생성자가 default이기 때문에 외부패키지에서 엑세스 불가(인스턴스화 불가!)
    }
}
