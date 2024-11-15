public class MainArg {
    public static void main(String[] args) {
        //main 메서드의 매개변수를 활용하는 방법
        //(인텔리제이) 오른쪽 위의 ...버튼 클릭
        //run with parameters 클릭
        //program arguments 창에 매개변수를 차례로 입력하고 run 버튼 클릭
        //예시 ) hello 100 true 3.14
        // 입력시 ' '(스페이스)로 나눌 수 있음
        //상단 current파일이 MainArg로 변경

        System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);


    }
}
