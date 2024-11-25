package Set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet =new TreeSet<>();
        //TreeSet에 정수 데이터를 자동으로 추가
        for(int i=50;i>0;i-=2){
            treeSet.add(i);
        }
        //50,48,46... 순서대로 데이터 입력했지만 자동으로  정렬되어 출력됨
    System.out.println(treeSet); //2,4,6,8,10,~~~~~50까지 순차적으로 출력

        //1.first
        System.out.println(treeSet.first());
        //2.last
        System.out.println(treeSet.last());
        //3.lower
        System.out.println(treeSet.lower(26));
        //4.higher
        System.out.println(treeSet.higher(26));
        //5.floor
        System.out.println(treeSet.floor(25));
        System.out.println(treeSet.floor(26));
        //6.ceiling
        System.out.println(treeSet.ceiling(25));
        System.out.println(treeSet.ceiling(26));
        //7.pollFirst
        int treeSetSize = treeSet.size();//25
        System.out.println(treeSet);
        for (int i =0;i<treeSetSize;i++){
            System.out.println(treeSet.pollFirst() + " ");
        }
        System.out.println();
        System.out.println(treeSet.size());//0

        //8.pollLast
        for (int i =50;i>0;i-=2){
            treeSet.add(i);
        }
        treeSetSize =treeSet.size();
        for (int i=0;i<treeSetSize;i++) {
            System.out.println(treeSet.pollLast()+ " ");
        }
        System.out.println();
        System.out.println(treeSet.size());

        //Set으로부터 특정조건의 Set을 얻는 메서드
        for (int i =50;i>0;i-=2){
            treeSet.add(i);
        }
        //9.SortedSet<E> headSet(E element) : 특정조건을 기준으로 앞부분 Set을 읽음
        SortedSet<Integer> sSet = treeSet.headSet(20);// 20 포함 X
        System.out.println(sSet);

        //10.Navigable<E> headSet(E element,inclusive) : 특정조건을 기준으로 앞부분 Set을 읽음
        //NavigableSet으로 타입변환하면 조건의 포함여부를 선택할수 있음 (true는 포함/ false는 포함 X)
        NavigableSet<Integer> nSet = treeSet.headSet(20,true); //true이므로 20포함
        System.out.println(nSet);
        nSet =treeSet.headSet(20,false); //false이므로 20 제외
        System.out.println(nSet);

        //11. Navigable<E> tailSet(E element) : 특정조건을 기준으로 뒷 부분 Set 읽음
        sSet= treeSet.tailSet(20);
        System.out.println(sSet);
        //12.Navigable<E> tailSet(E element,inclusive)
        nSet=treeSet.tailSet(20,true);
        System.out.println(nSet);
        nSet=treeSet.tailSet(20,false);
        System.out.println(nSet);

        //13.SortedSet<E> subSet(E element, E element) : 특정조건을 기준으로 중간을 읽음
        sSet =treeSet.subSet(10,20);
        System.out.println(sSet);
        //14.Navigable<E> subSet(E element,inclusive, E element,inclusive)
        nSet=treeSet.subSet(10,false,20,true);
        System.out.println(nSet);

        //15.Navigable<E> descendingSet
        System.out.println(treeSet);
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println(descendingSet);
        descendingSet =descendingSet.descendingSet();
        System.out.println(descendingSet);


    }
}
