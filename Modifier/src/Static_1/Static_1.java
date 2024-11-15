package Static_1;

public class Static_1 {
    public static void main(String[] args) {
        A a1=new A();//인스턴스 a1생성
        System.out.println(a1.m); //3
         //정적필드 읽기
        //1번째 방법
        System.out.println(A.n); //A클래스에 있는 정적 필드 n 읽기 //5
        //2번째 방법
        A a2=new A();
        System.out.println(a2.n);// 인스턴스필드와 읽는 방법 동일함 (권장 x)
        //정정필드 수정
        A.n=10; //정적필드는 오직 한개만 존재함
        System.out.println(a1.n);//10
        System.out.println(a2.n);//10

        a1.n=7;
        a2.n=8;
        System.out.println(a1.n);//8
        System.out.println(a2.n);//8

    }
}
class A{
    int m=3; //인스턴스 필드 //힙 메모리에 저장
    static int n=5; //정적 필드 (스태틱 필드) // 스태틱 영역에 오로지 하나만 존재함 존재
}