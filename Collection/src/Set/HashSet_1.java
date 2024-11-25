package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_1 {
    public static void main(String[] args) {
        Set<String> hset1 = new HashSet<>();
        //1. add
        hset1.add("A");
        hset1.add("B");
        hset1.add("C");
        hset1.add("A"); //중복 저장 X
        System.out.println(hset1); // A, B, C  --> 출력순서가 고정 X / 랜덤
        //2. addAll
        Set<String> hset2 = new HashSet<>();
        hset2.add("C");
        hset2.add("D");
        hset2.addAll(hset1);
        System.out.println(hset2); //A,B,C,D  --> 출력출력 / 중복된 C는 저장 X
        //3. remove
        hset2.remove("B");
        System.out.println(hset2); //A, C ,D
        //4.clear
        hset2.clear();
        System.out.println(hset2); //[]
        //5.isEmpty
        System.out.println(hset2.isEmpty()); //true
        //6.contains
        Set<String> hset3= new HashSet<>();
        hset3.add("A");
        hset3.add("B");
        hset3.add("C");
        System.out.println(hset3.contains("B")); //true
        System.out.println(hset3.contains("D")); //false
        //7.size
        System.out.println(hset3.size()); //3
        //8.iterator
        Iterator<String> iterator = hset3.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //9.toArray()
        Object[] objects = hset1.toArray();
        System.out.println(Arrays.toString(objects));

        String[] strArray = hset1.toArray(new String[0]);
        System.out.println(Arrays.toString(strArray));

        String[] strArray1 = hset1.toArray(new String[5]);
        System.out.println(Arrays.toString(strArray1));







    }
}
