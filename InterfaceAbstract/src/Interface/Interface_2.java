package Interface;

//인터페이스의 구성요소
interface A1{
    //필드는 상수만 존재(final)
    public static final int a =3;
    //생성자 없음
    //추상메서드
    public abstract void abc();
}
interface A2{
    int b=3; // 생략해도 컴파일러가 자동으로 public static final을 앞에 붙임
    void bcd(); // 생략해도 컴파일러가 자동으로 public abstract을 앞에 붙임
}

public class Interface_2 {
    public static void main(String[] args) {
        System.out.println(A2.b); //3
        //A2.b=5;// 에러 발생 b는 상수이기 때문에
        System.out.println(A1.a); //3


    }
}
