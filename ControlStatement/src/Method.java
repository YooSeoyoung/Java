public class Method {
    public static void main(String[] args) {
        //메서드 없이 홀짝을 구분하는 코드

        int num=4;
        String str=(num%2==0)?"짝수":"홀수"; //삼항 연사자를 사용한 비교문
        System.out.println(str);
        num=5;
        str=(num%2==0)?"짝수":"홀수";
        System.out.println(str);
        num=6;
        str=(num%2==0)?"짝수":"홀수";
        System.out.println(str);
        num=7;
        str=(num%2==0)?"짝수":"홀수";
        System.out.println(str);
        num=8;
        str=(num%2==0)?"짝수":"홀수";
        System.out.println(str);
        num=9;
        str=(num%2==0)?"짝수":"홀수";
        System.out.println(str);
        num=10;
        str=(num%2==0)?"짝수":"홀수";
        System.out.println(str);

        System.out.println();

        //메서드의 사용,호출(=call method)
        checkOddEven(4); //매개변수로 정수 4 사용
        checkOddEven(5); //매개변수로 정수 5 사용
        checkOddEven(6);
        checkOddEven(7);
        checkOddEven(8);
        checkOddEven(9);
        checkOddEven(10);

        // checkOddEven(int number=5);//에러!!! 매개변수는 값만 입력

        System.out.println();

        //리턴타입
        System.out.println("메서드의 return");
        checkOddEven(100);
        System.out.println(checkOddEven2(100));
    }

    /*
    checkOddEven(4);
    int number=4; // 내부적으로 동작
    String str=(number%2==0)?"짝수":"홀수";
        System.out.println(str); //짝수
    *checkOddEven(5);
    int number=5; // 내부적으로 동작
    String str=(number%2==0)?"짝수":"홀수";
        System.out.println(str); //홀수
        .......계속(10까지)

        ****int 변수의 생존기간은!!!!! {
        String str=(number%2==0)?"짝수":"홀수";
        System.out.println(str);
    } 까지이다!!!
    그래서 int number=5로 넘어갈때는 int number=4라는 변수는 사라지고
    int number=5가 새로 생기는 구조이다.
     */

    //메서드의 선언, 정의
    //public static void checkOddEven(int number) //에러!! 정의는 자료형 필수

    public static void checkOddEven(int number){
        String str=(number%2==0)?"짝수":"홀수";
        System.out.println(str);
    }
    //호출
    //method1(10,3.5,true,"Hello");
    //method1(10000,3.1458694,false,"Hi")

    //정의
    //public static void method1(int a, double b, boolean c, String str{}

    public static String checkOddEven2(int number) {
        String str = (number % 2 == 0) ? "짝수" : "홀수";
        return str;
    }
}
