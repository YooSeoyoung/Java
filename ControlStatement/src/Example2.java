public class Example2 {
    public static void main(String[] args) {
        // 다영한 메서드 만들어보기
        String str="Hello";
        int length= str.length();
        System.out.println(length);
        //문자열의 길이를 반환하는 메서드
        System.out.println(getLength("Hello World"));
        System.out.println(getLength("Please help me"));
        System.out.println(getLength("Happy birthday"));

    }
        public static int getLength(String str){
                return str.length();
        }
}
