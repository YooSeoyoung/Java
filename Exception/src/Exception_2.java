public class Exception_2 {
    public static void main(String[] args) {
        //다중 try~catch문
        try{
            System.out.println(3/0);
            int num = Integer.parseInt("10A"); //NumberFormatException
            int[] array = new int[3];
            array[3] = 0;
        }catch (ArithmeticException e){ // ArithmeticException은 클래스 e는 변수
            //e는 메서드의 매개변수처럼 예외 인스턴스 변수 / 내부에 예외상황을 알 수 있는 메세지를 가지고 있음
            System.out.println(e.getMessage());
            System.out.println("0으로 나눌 수 없음");

        }catch (NumberFormatException e){
            System.out.println("숫자가 아닙니다");
        }
//        //예상 가능한 예외는 catch문을 통해서 예외처리를 해주는게 원칙이나, 만약 예상하지 못한 예외의 가능성이 있다면 제일 아래에 부모 예외클래스를 추가해주면 모든 예외를 처리해줄 수 있음
//        catch (RuntimeException e) {
//            System.out.println("기타 예외 발생... 하지만 난 처리했음");
//        }
    }
}
