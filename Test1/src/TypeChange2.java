public class TypeChange2 {
    public static void main(String[] args) {

        //!!!! 자동 타입 변환
        //업캐스팅
        float value1=3; //모든 정수는 기본적으로 int로 인식
        long value2=5;
        double value3=7;
        //다운캐스팅
        byte value4=9; //!예외적인 부분! 컴파일러 단계에서 정확하게 작성된 자료형에 대한 크기로 인식 , 근데 운영체제에서는 다름
        // 운영체제의 최소 단위는 기본적으로 메모리가 8바이트, 그 아래는 할당은 못함
        short value5=11;//자동 변환, 값에 담을 수 있으면 자동으로 다운 캐스팅으로 인식을 하고 데이터 손실이 없다.

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        //!!!! 수동 타입 변환
        //다운 캐스팅인데 에러가 발생!! 명시적인 캐스팅이 필요함
        byte value6=(byte)128;
        int value7=(int)3.5;
        float value8=(float) 7.5;

        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);

    }
}
