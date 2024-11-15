public class String1 {
    public static void main(String[] args) {
        int a=0;
        String str= Integer.toString(a);
        System.out.println(str);

        //문자열ㄹ - > 숫자
        String str2="10";
        int b = Integer.parseInt(str2); // int로 리턴
        System.out.println(b+1);
        Integer c = Integer.valueOf(str2); // Integer로 리턴 (래퍼 클래스)
        System.out.println(c+1); // 원래는 같은 데이터 타입끼라만 산술연사자 사용이 가능함( 근데 c는 Integer이기 때문에 int 타입으로 자동 변환)
        // 결과의 차이는 따로 없음
        //parseInt는 int를 리턴 , 수학계산에 사용
        //valueOf는 Integer(int의 Wrappper클래스)를 리턴 . 컬렉션에 사용


    }
}
