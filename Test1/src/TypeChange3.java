public class TypeChange3 {
    public static void main(String[] args) {

        int value1=3+5; //int끼리 연산하여 int인 8
        int value2=8/5;//int끼리 연산하여 int인 1 발생( 소수점 삭제)
        float value3=3.0f+5.0F;//float끼리 연산하여 float 8.0(f를 안쓰면 double이기 때문에 필수적으로 붙이기)
        double value4=8.0/5.0;//double끼리 연산하여 double 1.6(소수점 포함하여 계산)

        byte data1=3;//자동 타입 변환 (int로)
        byte data2=5;
        //byte value5=data1+data2 -> byte끼리 더하면 int로 자동 변동이 되기 때문에 에러
        int value5=data1+data2; //byte끼리 연산을 하게 되면 최소값인 int로 변하기 때문에 자료형은 int로 사용해야됨

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println();

        //int value6=5+3.5;-> 3.5는 double의 형태이기 때문에 int라는 캐스팅 타입 변환을 하지 않아 에러가 발생(다운 캐스팅 타입)

        double value6=5+3.5; //int보다 double이 더 큰 자료의 범위를 가지고 있기 때문에 double 사용
        int value7=5+(int)3.5;// 3.5는 원래 double의 형태이지만 int로 캐스팅 타입 변환을 하였기 때문에 3으로 인식하여 8결과값 출력

        double value8=5/2.0;//double로 자동 계산
        byte data3=3;
        short data4=5;
        int value9= data3+data4;//byte랑 short끼리의 연산 결과는 int로 출력이 되기 때문에 int자료형 사용 필요
        double value10= data3+data4;//data3+data4는 int형이므로 자동 타입 변환 수행으로 하여 int보다 double의 형태가 더 크므로 8.0 출력

        System.out.println(value6);
        System.out.println(value7);
        System.out.println(value8);
        System.out.println(value9);
        System.out.println(value10);

        boolean flag=true;
        System.out.println(flag);

        int name3 =4;
        System.out.println(name3);
        System.out.println((int)5.6+3.5);
        System.out.println((int)(5.6+3.5));
        System.out.println(7/4);
        System.out.println((double) 3/2);
        System.out.println((double) (3/2));


    }
}
