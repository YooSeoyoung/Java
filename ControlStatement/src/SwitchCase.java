import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int a=2;
        switch (a){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B"); //a의 값이 2일 경우 case2번호으로 넘어와서 실행
                break; // 만약 해당 값 출력 시 , 출력 시점에서 밑에 있는 값에 대한 실행은 하지 않도록 하는 제어 키워드
                       // break 제어 키워드를 사용x -> case2~default까지 다 출력 "BCD"
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");

        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("요일을 입력해주세요: ");
        String day=scanner.nextLine();
        switch (day){
            case "월":
            case "월요일" : //월 아니면 월요일 둘중에 하나만 써도 sout에 입력된 값 출력
                System.out.println("오늘은 월요일입니다");
                break;
            case "화":
            case "화요일" :
                System.out.println("오늘은 화요일입니다");
                break;
            case "수":
            case "수요일" :
                System.out.println("오늘은 수요일입니다");
                break;
            case "목":
            case "목요일" :
                System.out.println("오늘은 목요일입니다");
                break;
            case "금":
            case "금요일" :
                System.out.println("오늘은 금요일입니다");
                break;
            case "토":
            case "토요일" :
                System.out.println("오늘은 토요일입니다");
                break;
            case "일":
            case "일요일" :
                System.out.println("오늘은 일요일입니다");
                break;
            default:
                System.out.println("오늘은 공휴일입니다");
        }
        scanner.close();// 스캐너 객체를 메모리에서 삭제시킨
    }
}
