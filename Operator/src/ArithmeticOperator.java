public class ArithmeticOperator {
    public static void main(String[] args) {
        //산술연산자
        System.out.println(2+3);
        System.out.println(8-5);
        System.out.println(7*2);
        System.out.println(7/2);
        System.out.println(8%5);//모듈로는 나머지를 연산결과로 나온다
        System.out.println();

        //증감연산자(++,--)

        int value1=3;
        value1++;// value1=value1+1을 의미한다. value1을 먼저 그대로 읽어온 다음에 1을 더하고 다시 value1을 4로 바꾼다(동적 코드),
        // 대입연산자를 별도로 사용하지 않고 애시당초에 대입연산자를 내부에 가지고 있음 ( 사실 코드가 2줄로 표현이 되지만 축약한거다)
        System.out.println(value1);

        int value2=3;
        ++value2;
        System.out.println(value2);//value1과 결과의 차이는 없다(value1,2를 다른쪽에서 사용(참조)을 하지 않기 때문에)

        int value3=3;
        int value4=value3++;//value3을 value4에다가 먼저 대입을 한 후에 증감연산자를 수행한다
        //value3=value3+1;의 축약 표현이다.
        System.out.println(value4);//3
        System.out.println(value3);//4

        int value5=3;
        int value6=++value5;//value5에 증감연산자를 수행한 후 value6에다가 대입을 한다
        //value6=(value5+1)
        System.out.println(value6);//4
        System.out.println(value5);//4

        //절대 이런짓 하지말자!!!
        int value7=3;
        int value8=4;
        int value9=2+value7-- + ++value8;
        // 풀어서 작성 시 ▽
        //value8= value8+1(5), int value9=2+value7+value8(10), value7=value7-1(2)이 정석
        System.out.println(value7); //2
        System.out.println(value8); //5
        System.out.println(value9);// 2 + value7(3) : 대입 먼저 +value8(5) : 수행 먼저

    }
}
