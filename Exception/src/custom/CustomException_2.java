package custom;

/* 예외전가를 구현할때 MyException과 MyRTException의 구현상 차이점이 있음
* 1. MYRTException의 경우 : 예외처리(catch)를 하지 않고 call 메서드가 throws하지 않아도 JVM이 예외처리해줌
* ==> 자바 컴파일러가 RuntimeException 계열의 경우, 예외처리를 강제하지 않도록 설계되어있음(설계 철학의 문제)
* 2. MyException의 경우 : 예외처리(catch)를 하지 않고 call 메서드가 throws하지 않으면 컴파일 에러가 발생
* 반드시 !! 콜 스택 내의 모든 메서드들이 throws해야함(main 메서드도 throws 가능함) */

class C{
    void setAge(int age) throws MyRTException{
        if(age>=0){
            System.out.println("정상동작");
        }else {
            throw new MyRTException("나이가 음수입니다.");
        }
    }
    void callSetAge(int age){
            setAge(age); // RuntimeException은 try~catch문을 사용하지 않아도 컴파일러 에러가 발생하지 않고 jvm이 처리해줌
    }
}
class D{
    void setAge(int age) throws MyException{
        if(age>=0){
            System.out.println("정상동작");
        }else {
            throw new MyException("나이가 음수입니다.");
        }
    }
    void callSetAge(int age) throws MyException{
        setAge(age); // Exception은 try~catch문을 사용하지 않으면 컴파일러 에러가 발생하기 때문에 throws를 하거나 try~catch문을 사용해야된다
    }
}

public class CustomException_2 {
    public static void main(String[] args) throws MyException {
//        C c = new C();
//        c.callSetAge(-1);

        D d = new D();
        d.callSetAge(-1);
    }
}
