package P1031;

public class Constructor2 {
    public static void main(String[] args) {
        AA a1=new AA();
        AA a2=new AA(3);
        AA a3=new AA(3,5);
        AA a4=new AA("Hello");
        System.out.println(a2.a); //0
        System.out.println(a3.a); //0
        //필드 a가 생성자에 의해 초기화되지 못했음
        //원인 : 생성자 내에 필드와 배개변수의 이름이 같으면 필드에 this 키워드를 명시적으로 사용해야 함
        //명식적인 표시가 없으면 자바는 지역변수 a로 판단함
    }
    //생성자의 오버로딩
    // (생성자의 이름은 같고, 매개변수의 갯수 또는 타입이 다른 경우)
}
class AA{
    int a;
    int b;
    String str;
    AA(){
        System.out.println("기본 생성자");
    }
    AA(int a){
        a=a;
        System.out.println("매개변수 1개 int");
    }
    AA(int a, int b){
        a=a;
        b=b;
        System.out.println("매개변수 2개 ");
    }
    AA(String str){ // 매개변수의 타입이 달라도 오버로딩 성립
        str=str;
        System.out.println("매개변수 1개 문자열");
    }
}
