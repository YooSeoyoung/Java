package custom;

class MinusException extends RuntimeException{
    public MinusException(){
        super();
    }
    public MinusException(String message){
        super(message);
    }
}
class OverException extends RuntimeException{
    public OverException(){
        super();
    }
    public OverException(String message){
        super(message);
    }
}

class AA{
    // 여러 개의 발생 가능한 예외를 함께 던질 수 있음
    void checkScore(int score) throws MinusException, OverException{
        if(score<0){
            throw new MinusException("예외 발생 : 음숫값 입력");
        }else if (score>100) {
            throw new OverException("예외 발생 : 100점 초과");
        }else
            System.out.println("정상적인 값입니다.");
        }
        void caller1(int score){
        caller2(score);
        }
        void caller2(int score){
        checkScore(score);
        }
    }

public class CustomException_3 {
    public static void main(String[] args) {
        AA aa = new AA();
        try {
            aa.caller1(85);
            aa.caller1(150);
            aa.caller1(-1);  // 음수 값에 대한 에러를 체크하고 싶으면 위에 있는 150을 주석처리하고 실행해야지만 확인이 가능하다
        }catch (MinusException | OverException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
            for (StackTraceElement element: e.getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}
