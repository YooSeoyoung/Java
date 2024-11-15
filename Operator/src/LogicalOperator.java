public class LogicalOperator {
    public static void main(String[] args) {
        //논리 연산자(&&,||,^,!)
        //&&
        System.out.println(true&&true); //true
        System.out.println(true&&false);//false
        System.out.println(true&&(5<3));//false
        System.out.println((5<=5) &&(7>2));//true
        System.out.println();
        //||
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false ||(5<3));//false
        System.out.println((5<=5)|| (7>2));//true
        System.out.println();
        //^
        System.out.println(true^true);//false
        System.out.println(true^false);//true
        System.out.println(false^(5<3));//false
        System.out.println((5<=5)^ (7>2));//false
        System.out.println();
        //!
        System.out.println(!true);//false
        System.out.println(!false);//true
        System.out.println(false || !(5<3));//true
        System.out.println((5<=5) || !(7>2));//true(쇼트서킷)
        System.out.println();

        //쇼트서킷에 대한 예
        int value1=3;
        System.out.println(false && ++value1>6);//false
        //and의 첫번째 조건에 false가 나왔을 경우 두번째 등의 봐도 무조건 false로 판단하여 ++~부터 실행 x
        System.out.println(value1);//3 / 뒤에는 실행되지 않았기 때문에 ++value 자체가 동작하지 않음

        int value2=3;
        System.out.println(false & ++value2>6);
        System.out.println(value2);

        int value3=3;
        System.out.println(true || ++value3>6);
        System.out.println(value3);

        int value4=3;
        System.out.println(true | ++value4>6);
        System.out.println(value4);
    }
}
