public class RelationOperater {
    public static void main(String[] args) {
        //비교연산자
        //크기 비교
        System.out.println(5<2);//false
        System.out.println(5>2);//true
        System.out.println(5<5);//false
        System.out.println(5<=5);//true
        System.out.println(5>=5);//true
        System.out.println();

        //등가 비교
        int a=5;
        int b=2;
        int c=5;
        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        System.out.println(a==c);//true
        System.out.println(a!=c);//false
        System.out.println();

        //참조 자료형의 참조 비교(중요!!!)
        String str1= new String("안녕");
        //str이라는 변수를 만든다(스택 영역) -> new : 힙에다가 메모리를 쓰라는 요청/새 공간을 달라고 하는 것(참조형만 가능함)
        //2번째 String에는 new의 변수명 저장하는 것 ( 즉, 데이터 타입)
        String str2= new String("안녕");
        System.out.println(str1==str2);//false

        //비교 연산자 같은 경우에는 스택 메모리에 저장된 메모리 값을 비교를 하는데
        // String은 참조 자료형이기 때문에 스택에는 번지 주소가 저정되어있 것
        // --> 번지 주소는 똑같은 문자열을 가지고 있다고 해도 각각의 변수마다 다르게 존재한다.

        //리터럴 방식의 문자열 생성과 비교
        String str3="안녕";
        String str4="안녕";
        System.out.println(str3==str4);
        //리터럴 방식 : 자바가 메모리를 효율적으로 관리하기 위해 사용하는 것
        // 힙에 다른 위치에 만들어지지 않고 같은 위치를 공유하고 있다
        //new없이 사용 가능한 참조형은 String밖에 없다
        //영역을 삭제 혹은 수정 불가능함( 불변)

        //참조값의 복사후 비교
        String str5= new String("안녕");
        String str6= str5; //같은 주소값 공유
        System.out.println(str5==str6);// true

    }
}
