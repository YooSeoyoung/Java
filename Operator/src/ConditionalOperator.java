public class ConditionalOperator {
    public static void main(String[] args) {

        //삼항 연산자
        //--> 하나의 명령셋으로 치환 ( 즉, 하나의 값으로 치환이 가능하다)
        int value1=(3>5)?6:9;//value1의 값(3>5)이 참이면 6 거짓이면 9
        System.out.println(value1);//9

        //if 조건문으로 변환하면,
        if(3>5){
            value1=6;
            System.out.println(value1);
        }else {
            value1=9;
            System.out.println(value1);
        }

        int value2=(5>3)?10:20;//value2의 값이 참이면 10 거짓이면 20
        System.out.println(value2);//10

        int value3=3; //value3 모듈로(3 나누기 2의 나머지 값)이 0과 같으면 짝수 다르면 홀수
        System.out.println((value3%2==0)?"짝수":"홀수");//홀수

        //if 조건문의 형태

        if(value3%2==0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

    }
}
