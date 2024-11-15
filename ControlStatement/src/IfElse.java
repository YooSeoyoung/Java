import java.util.Scanner;//util이라는 공간안에 있는 Scanner을 불러와 사용

public class IfElse {
    public static void main(String[] args) {
        int a=10;//무조건 실행
        if(a>5){// 무조건 실행
            System.out.println(a);// 실형 여부는 조건식에 따라 다름
        }else{
            System.out.println("조건은 거짓");// 실형 여부는 조건식에 따라 다름
        }


        Scanner scanner = new Scanner(System.in);//참조자료형을 선언, 개발자로부터 인풋을 받음(터미널에 입력)
        System.out.println("나이를 입력해주세요");
        int userAge= scanner.nextInt();

        if (userAge>20 && userAge<=30){
            System.out.println("20대");
        } else if (userAge>30 && userAge<=40){
            System.out.println("30대");
        } else if (userAge>40 && userAge<=50) {
            System.out.println("40대");
        }else{
            System.out.println("나머지");
        }
        System.out.println("끝");//if문과 상관 없이 무조건 실행
        System.out.println();

        scanner.nextLine();//Scanner가 가지고 있는 "엔터" 버퍼를 비워줘야됨

        System.out.println("이름을 입력해주세요");
        String userName= scanner.nextLine(); //scanner.nextInt 작성할때 사용한 엔터를 하나의 기호로 판단하여 인풋으로 소진함
        System.out.println(userName);
        System.out.println("끝");


    }// 프로그램의 종료(main합수는 프로그램의 시작과 끝을 의미함)
}
