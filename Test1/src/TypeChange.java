public class TypeChange {
    public static void main(String[] args) {

        //타입 캐스팅(타입 변환)

        int value1=(int)5.3;//5.3은 double형이고 int형은 소수를 가지고 있지 않으니 지수 부분은 자동으로 삭제(반올림 등 발생 x)
        long value2=(long)10;//(long)을 안써도되지만 명시적/ 구분하기 편하기 때문에 사용함
        float value3=(float)5.8;//(float) 혹은 F를 필수적으로 사용을 해야지만 에러가 나지 않음
        double value4=(double)16;//double형은 소수점을 표현하기 때문에 정수로 표현을 해도 뒤에 .0이 붙음/(double)를 사용 안해도됨
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println();

        long value5=10l;
        float value6=5f;// float형은 소수점을 표현하기 때문에 정수로 표현을 해도 뒤에 .0이 붙음
        System.out.println(value5);
        System.out.println(value6);
    }
}
