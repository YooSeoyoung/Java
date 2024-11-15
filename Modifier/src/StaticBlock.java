public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(B.b);

    }
}
class B{
    int a;
    static int b;
    //아무것도 없을 때는 초기값 0이다//0이면 if문 조건에 부합하여 5 출력
    // b=1이면 스태틱 블록 실행이 되지 않아 1로 출력될 것이다.
    static { // 스태틱 블록(정적 필드 초기화) //로딩되는 시점에 실행
        //정적필드의 초기화는 주로 생성자를 사용하지 않음
        //static 초기화블럭은 정적필드를 초기화하기 위해서 사용하며
        //조건에 따라 다른 값으로 초기화할 수 있다는 장점이 있다
        if(b==0){
            b=5;
            System.out.println("클래스 B가 로딩되었습니다.");
        }
    }
}
