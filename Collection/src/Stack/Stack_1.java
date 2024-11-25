package Stack;

//후입선출 (LIFO) => Last In First Out
//카드의 덱이 먼저 놓여진 카드가 나중에 선택되는 것과 같이 나중에 저장된 일이 먼저 실행되는 방식
//주로 수행작업의 히스토리 저장( 브라우저의 페이지 ) 또는 재귀함수 처리 등에 사용됨
import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>() ;
        stack.push(2);
        stack.push(5);
        stack.push(3);
        stack.push(7);

        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println(stack.search(7));
        System.out.println(stack.search(3));
        System.out.println(stack.search(5));
        System.out.println(stack.search(2));
        System.out.println(stack.search(9));
        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println();

        System.out.println(stack.empty());


    }
}
