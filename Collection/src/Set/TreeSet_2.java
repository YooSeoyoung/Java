package Set;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass {
    int data1;
    int data2;
    public MyClass(int data1, int data2) {
        this.data1=data1;
        this.data2=data2;
    }
}
class MyComparableClass implements Comparable<MyComparableClass>{
    int data1;
    int data2;
    public MyComparableClass(int data1, int data2) {
        this.data1=data1;
        this.data2=data2;
    }
    @Override
    public int compareTo(MyComparableClass o) { //크기비교의 기준을 여기서 설정 (음수, 0, 양수)
        if(this.data1<o.data1) return -1;
        else if(this.data1 == o.data1) return 0;
        else return 1;
    }
}

public class TreeSet_2 {
    public static void main(String[] args) {
        //#1. Integer 크기 비교
        TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
        Integer intValue1 = Integer.valueOf(20);
        Integer intValue2 = Integer.valueOf(10);
        treeSet1.add(intValue1);
        treeSet1.add(intValue2);
        System.out.println(treeSet1.toString());

        //#2. String 크기 비교
        TreeSet<String> treeSet2 = new TreeSet<String>();
        String str1 = "가나";
        String str2 = "다라";
        treeSet2.add(str1);
        treeSet2.add(str2);
        System.out.println(treeSet2.toString());

        //#3. MyComparableClass 객체 크기 비교 방법#1
        // Comparable인터페이스의 compareTo()를 오버라이드
        TreeSet<MyComparableClass> treeSet4 = new TreeSet<MyComparableClass>();
        MyComparableClass myComparableClass1 = new MyComparableClass(2, 5);
        MyComparableClass myComparableClass2 = new MyComparableClass(3, 3);
        treeSet4.add(myComparableClass1);
        treeSet4.add(myComparableClass2);
        for(MyComparableClass mcc : treeSet4) {
            System.out.println(mcc.data1);
        }

        //#4. MyClass 객체 크기 비교 방법 #2.
        // Comparator인터페이스의 compare()를 익명이너클래스방식으로 선언
        TreeSet<MyClass> treeSet5 = new TreeSet<MyClass>(new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                if(o1.data1<o2.data1) return -1;
                else if(o1.data1 == o2.data1) return 0;
                else return 1;
            }
        });
        MyClass myClass1 = new MyClass(2, 5);
        MyClass myClass2 = new MyClass(3, 3);
        treeSet5.add(myClass1);
        treeSet5.add(myClass2);
        for(MyClass mc : treeSet5) {
            System.out.println(mc.data1);
        }


    }
}