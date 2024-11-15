import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        //배열의 선언

        int[] array1=new int[3];//int형 자료 3개를 힙 영역에 생성 // 배열의 선언
        double[] array2;
        array2=new double[5];
        String[] array3= new String[10];// 참조자료형도 배열을 만들 수 있음

        //배열에 값을 대입하는 법
        array1[0]=1; //0을 0번 인덱스라고 부름 또는 인덱스0
        array1[1]=2; //1을 1번 인덱스라고 부름 또는 인덱스1
        array1[2]=3; //2을 2번 인덱스라고 부름 또는 인덱스2
        //읽는 법 : "array1의 0번 인덱스의 값은 1이다"
        System.out.println(array1[0]+" "+array1[1]+ " " +array1[2]);
        System.out.println(Arrays.toString(array1));
        array3[0]="첫번째";
        array3[1]="두번째";
        //참조자료형의 경우, 힙에 메모리공간을 만들고 값을 대입하지 않으면 null이 자동으로 들어감
        System.out.println(Arrays.toString(array3));

        //int형의 배열 생성과 값 대입
        //배열번수의 이름은 영어단어의 복수형으로 사용한다.(예.numbers)
        int [] numbers = new int[3];
        numbers[0]=10;
        numbers[1]=20;
        //기본자료형의 경우, 힙에 메모리공간을 만들고 값을 대입하지 않으면 초기값이 자동으로 들어감
        //초기값(0,0.0,false, null문자 (유니코드 0번)
        System.out.println(Arrays.toString(numbers));

        double[] doubles =new double[1];
        boolean[] booleans=new boolean[1];
        char[] chars= new char[1];
        System.out.println(doubles[0]);
        System.out.println(booleans[0]);
        System.out.println(chars[0]);
    }
}