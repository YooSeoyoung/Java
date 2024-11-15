public class Example13 {
    public static void main(String[] args) {
        // 매개변수로 전달한 문자의 범위안에 문자가 몇개가 있는지
        // 카운트하여 문자의 갯수를 리턴하는 메서드
        // 모든 문자는 유니코드상의 숫자로 치환됨
        // 대문자 'A'=65 ~ 'Z'=90
        // 소문자 'a'=97 ~ 'z'=122
        // 91=[, 92=\, 93=], 94=^, 95=_, 96=`
        System.out.println(findCharCount('A','Z')); // 26
        System.out.println(findCharCount('h','q')); // 10
        System.out.println(findCharCount('W','p')); // 20
    }
    public static int findCharCount(char str1, char str2){
        int count =0;
        int a = str1;
        int b = str2;
        for (int i=a;i<=b;i++){
            if (!(i>='[' && i<='`')){ // `백틱이라고 부름
                count=count+1;
            }
        }
        return count;
    }
}
