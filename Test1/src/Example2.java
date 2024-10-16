public class Example2 {
    public static void main(String[] args) {

        //정수형
        byte a=1; //1byte
        short b=128;//2byte
        int c=1000;//4byte
        long d=100000L;//8byte
        System.out.println(c);

        //실수형
        float e=3.5F;//4byte F가 필수적으로 필요함(기본적으로 소수는 double로 인식하기 때문에 F를 붙여서 float임을 인식 시켜주기)
        double f=3.141655405132;//8byte

        //문자형
        char g='A';//byte
        String h="안녕하세요"; //가변형(값마다 바이트가 상이함)

        //불리언형 (참거짓)
        boolean i=false;//1byte (1bit로도 가능하지만 최소 단위인 byte 사용)
        //숫자 진법에 따른 다양한 표기법
        c=15;//10진법 ->이쪽에서 부터 int c=1000이 없어지고 c=15로 변경
        System.out.println(c);
        c=0b1111;//2진법
        System.out.println(c);
        c=0xF;//16진법 표기
        System.out.println(c);

    }
}
