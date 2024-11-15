public class Example14 {
    public static void main(String[] args) {
        // 매개변수로 전달한 문자의 범위안에 모음의 갯수를 리턴하는 메서드
        // 모든 문자는 유니코드상의 숫자로 치환됨
        // 영어의 모음 A E I O U a e i o u
        // 대문자 'A'=65 ~ 'Z'=90
        // 소문자 'a'=97 ~ 'z'=122
        // 91=[, 92=\, 93=], 94=^, 95=_, 96=`
        System.out.println(findVowelCount('A','Z')); // 5
        System.out.println(findVowelCount('b','p')); // 3
        System.out.println(findVowelCount('j','n')); // 0

    }
//    public static int findVowelCount(char a,  char b){
//        int x=a;
//        int y=b;
//        int count=0;
//        for (int i=a;i<=b;i++){
//              if(i==65 || i==69 || i==73 || i==79 || i==85 || i==97 || i==101 || i==105 || i== 111 || i==117){
//                 count =count+1;
//             }
//        }
//        return count;
//    }

//    public static int findVowelCount(char a,  char b){
//        int count=0;
//        for (int i=(int)a;i<=(int)b;i++) {
//            switch (i){
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case 'U':
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    count=count+1;
//                    break;
//            }
//        }
//        return count;
//    }
    public static int findVowelCount(char a,  char b){
        char[] chars={'A','E','I','O','U','a','e','i','o','u'};
        int count=0;
        for (int i=(int)a;i<=(int)b;i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i == chars[j]) {
                    count = count + 1
                }
            }
        }
            return count;
        }
    }
