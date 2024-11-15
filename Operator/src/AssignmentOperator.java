public class AssignmentOperator {
    public static void main(String[] args) {

        //대입연산
        int value1=3;
        value1= value1+3;
        System.out.println(value1);//6
        System.out.println();

        //대입연산자 축약표현

        int value2;//변수의 선언
        value2=5;//변수의 대입
        System.out.println(value2+=2);//7 value2=value2+2의 축약표현
        value2=5; //value2초기화
        System.out.println(value2-=2);//3  value2=value2-2의 축약표현
        value2=5;
        System.out.println(value2*=2);//10
        value2=5;
        System.out.println(value2/=2);//2
        value2=5;
        System.out.println(value2%=2);//1




    }
}
