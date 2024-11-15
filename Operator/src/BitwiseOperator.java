public class BitwiseOperator {
    public static void main(String[] args) {

        //비트 연산자
        //자바 메서드로 진법 변환
        int data=13;
        System.out.println(Integer.toBinaryString(data));//2진수로 변환하는 메서드 사용
        System.out.println(Integer.toOctalString(data));//8진수로 변환하는 메서드 사용
        System.out.println(Integer.toHexString(data));//16진수로 변환하는 메서드 사용
        System.out.println();

        System.out.println(Integer.parseInt("1101",2));//""로 감싸진 문자열을 2진수로 변경
        System.out.println(Integer.parseInt("15",8));//""로 감싸진 문자열을 8진수로 변경
        System.out.println(Integer.parseInt("0D",16));//""로 감싸진 문자열을 16진수로 변경
        //진수표기법에 맞는 문자열을 작성해야지만 정상적으로 출력이 가능함
        System.out.println();

        System.out.println(13);
        System.out.println(0b1101);
        System.out.println(015);
        System.out.println(0xD);
        System.out.println();

        //&비트연산자(AND)
        System.out.println(3&10); //2
        System.out.println(12&9); // 8
        System.out.println(0b0011&0b1010);//2
        System.out.println(0x03&0x0A);//2
        System.out.println();

        //|비트연산자(OR)
        System.out.println(3|10);
        System.out.println(0b0011|0b1010);
        System.out.println(0x03|0x0A);
        System.out.println();

        //^비트연산자(XOR)
        System.out.println(3^10);
        System.out.println(0b0011^0b1010);
        System.out.println(0x03^0x0A);
        System.out.println();
        //~비트연산자(NOT)
        System.out.println(~3);
        System.out.println(~0b0011);
        System.out.println(~0x03);


    }
}
