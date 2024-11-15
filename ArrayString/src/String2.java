import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        //#1. 문자열 길이 length()
        String str1= "Hello Java!"; // 11개(스페이스,특수문자 포함)
        String str2 = "안녕하세요! 반갑습니다."; //13개(스페이스,특수문자 포함)
        System.out.println(str1.length()); //lenght는 메서드다~~
        System.out.println(str2.length());
        System.out.println();

        //#2. 문자열 검색 charAt(), indexOf(), lastIndexOf()
        System.out.println(str1.charAt(1));//e , 첫번째의 문자를 나타냄
        System.out.println(str2.charAt(1));//녕
        System.out.println();
        System.out.println(str1.indexOf('a')); //a으로 인덱스 위치는 7이다(먼저 찾는것만 찾고 끝)
        System.out.println(str1.lastIndexOf('a'));//끝 인덱스부터 찾기 시작하고 찾은 문자가 앞에서부터 몇번째 순서에 있는지 확인
        System.out.println(str1.indexOf('a', 8));//8번째 위치에서부터의 a의 문자를 찾아서 순서를 출력
        System.out.println(str1.lastIndexOf('a',8));//8번쨰 위치에서 a라는 인덱스를 왼쪽으로 가면서 찾아라~
        System.out.println(str1.indexOf("Java")); //첫자인 J의 위치를 확인
        System.out.println(str1.indexOf("java")); //못 찾을 경우, -1 출력 / 대소문자 구분 필요!!
        System.out.println(str1.lastIndexOf("Java"));
        System.out.println();

        //#3. 문자열의 변환 및 연결 valueOf(), concat()
        String str3= String.valueOf(2.3);// double를 String으로 변환
        String str4= String.valueOf(false);// boolean를 String으로 변환
        System.out.println(str3); //"2.3"
        System.out.println(str4); //"false"

        String str5= str3.concat(str4);// str3에다가 str4를 붙이기
        System.out.println(str5);
        String str6= "안녕" + 3; //안녕3
        String str7= "안녕".concat(String.valueOf(3));//안녕3

        //#4. 문자열을 byte[] 또는 char[]로 변환
        //byte array는 UTF-8 문자를 담는데 이용됨. 한글은 최소 2바이트가 필요
        // 1바이트에 한글이 담기지 않기 때문에 음수로 보이게 됨
        String str8= "Hello Java!";
        String str9= "안녕하세요";
        byte[] array1=str8.getBytes();
        byte[] array2=str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        //toCharArray()
        char[] array3= str8.toCharArray();
        char[] array4= str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));




    }
}
