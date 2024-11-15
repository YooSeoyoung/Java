package Overriding;

class AA{
    void print1(){
        System.out.println("AA클래스 print1");
    }
    void print2(){
        System.out.println("AA클래스 print2");
    }
}
class BB extends AA{
    @Override
    void print1() {// 오버라이딩
        System.out.println("BB클래스 print1");
    } //AA랑 오버라이딩
    void print2(int a){ //오버로딩
        System.out.println("BB클래스 print2");
    } //AA랑 오버로딩
}
// 오버라이딩과 오버로딩의 비교
public class Overriding_3 {
    public static void main(String[] args) {
        AA value1 =new AA();
        value1.print1(); //AA클래스 print1
        value1.print2(); //AA클래스 print2
        BB value2=new BB();
        value2.print1(); //BB클래스 print1 (오버라이딩)
        value2.print2(); //AA클래스 print2
        value2.print2(3); //BB클래스 print2
        AA value3 =new BB();
        value3.print1(); //BB클래스 print1 (오버라이딩)
        value3.print2(); // AA클래스 print2 (매개 변수없는 print2는 오직 AA에 존재)
        BB value4=(BB)value3;
        value4.print1(); //BB클래스 print1
        value4.print2(52); //BB클래스 print2




    }
}
