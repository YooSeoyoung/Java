class A{
    void abc(){
        bcd();
    }
    void bcd(){
        try {
            System.out.println(3/0);
        }catch (ArithmeticException e){
            System.out.println("클래스 A 예외 발생");
            System.out.println(e.getMessage());
        }
    }
}

class B{
    void abc(){
        try {
            bcd();
            System.out.println("예외 발생 후 출력이 될까요 ?"); // 출력 XXX ( 예외 발생 시점에 try문 탈출)
        }catch (ArithmeticException e){
            System.out.println("클래스 B 예외 발생");
            System.out.println(e.getMessage());
        }
    }
    void bcd() throws ArithmeticException{
        System.out.println(3/0);
    }
}

public class ExceptionThrow_1 { // 예외전가
    public static void main(String[] args) {
        B b = new B(); // 예외전가(실제 예외처리는 호출한메서드가 함)
        b.abc();
        A a = new A(); // 일반 예외처리 try~catch 문
        a.abc();

    }
}
