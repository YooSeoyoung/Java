package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//배열과 리스트의 비교
public class List_1 {
    public static void main(String[] args) {
        //배열 이용
        String[] array =new String[]{"A", "B", "C","D"};
        System.out.println(array.length); //4
        array[2] =null;
        //배열속의 데이터를 요소(element)라고 부름
        //배열은 요소를 삭제해도 메모리 공간은 남아있고 사이즈도 그대로임
        System.out.println(array.length); //4
        System.out.println(Arrays.toString(array)); //A B null D
        System.out.println();

        //List 이용
        //List는 인터페이스이므로 객체 생성 시 구현 클래스가 필요함
        //가장 유명한 List의 구현클래스는 ArrayList!!
        List<String> aList = new ArrayList<>();
        System.out.println(aList.size()); //0 empty(비어있음)
        aList.add("A");
        aList.add("B");
        aList.add("C");
        aList.add("D");
        System.out.println(aList.size()); //4
        aList.remove("C");
        aList.remove(0);
        System.out.println(aList.size()); //2  메모리 영역이 삭제됨
        System.out.println(aList);


    }
}

