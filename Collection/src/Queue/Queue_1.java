package Queue;

import java.util.LinkedList;
import java.util.Queue;

// 선입 선출범( FIFO) (=First In First Out)
//주로 키입력등의 이벤트 처리에 사용됨
// 먼저 들어온 객체정보를 먼저 사용
//인터페이스이기 때문에 구현체가 필요함(LinkedList 또는 PriorityQueue 사용)
//LinkedList의 노드 연결 방식이 큐의 특징인 잦은 삽입과 삭제의 처리에 적합
public class Queue_1 {
    public static void main(String[] args) {
        //예외처리 없는 메서드(안전장치가 없으므로 조심해서 사용)
        Queue<Integer> q1 = new LinkedList<>();
        //1. add
        q1.add(3);
        q1.add(4);
        q1.add(5);
        //2. element
        System.out.println(q1.element());
        //3. remove
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
       // System.out.println(q1.remove());

        //예외처리가 있는 메서드( 안전장치)
        Queue<Integer> q2 = new LinkedList<>();
        System.out.println(q2.peek());
        //1.offer
        q2.offer(3);
        q2.offer(4);
        q2.offer(5);
        //2. peek
        System.out.println(q2.peek());
        //3. poll
        System.out.println(q2.poll());
        System.out.println(q2.poll());
        System.out.println(q2.poll());
        System.out.println(q2.poll());


    }
}
