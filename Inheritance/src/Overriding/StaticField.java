package Overriding;

class S1{
    static int m= 3; //정적 필드
}
class S2 extends S1{
    static int m=4;  //정적 필드
}

//정정 필드( static 필드)의 오버라이딩 확인
//-> 인스턴스화를 하지 않아도 바로 값을 읽거나 쓸수 있음
public class StaticField {
    public static void main(String[] args) {
        //정적필드는 인스턴스를 만들지 않고 참조 가능
        System.out.println(S1.m); //3
        System.out.println(S2.m); //4

        //객체 생성 후 참조할 수 있음(권장 x)
        S1 value1 =new S1();
        S2 value2 = new S2();
        S1 value3 = new S2();
        System.out.println(value1.m);//3
        System.out.println(value2.m);//4
        System.out.println(value3.m);//3
        // 정적 필드는 오버라이딩 할 수있음
        //메모리 생성 위치가 독립적으로 만들어지므로 각자 존재
        //데이터 타입에 따라 참조되는 값이 달라짐


    }
}
