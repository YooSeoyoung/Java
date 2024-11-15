package Super1;

class A1 {
    A1() {
        this(3); //A1(int a)호출 후 A1()호출 (즉 2줄 호출)!!! this 혹은 super은 반드시 첫번째 줄에 있어야 함
        System.out.println("A1생성자 1");
        //this(3); //에러!!
    }
    A1(int a) {
        System.out.println("A1생성자 2");
    }
}
class B1 extends A1 {
    B1() {             // super는 명시적으로 사용하지 않는 한 기본 생성자는 자동으로 생성되기 때문에 this전에 super()가 자동 호출
        this(3);
        System.out.println("B1생성자 1");
    }
    B1(int a) {
        System.out.println("B1생성자 2");
    }
}
public class Super3 {
    public static void main(String[] args) {
        A1 value1 = new A1(); //A1생성자 2 ->A1생성자 1 순서대로 2줄 출력 (호출)
        A1 value2 = new A1(3); //A1 생성자 2호출
        B1 value3 = new B1();  //A1생성자 2 ->A1생성자 1 -> B1생성자 2-> B1생성자 1
        B1 value4 = new B1(3);  //A1생성자 2 ->A1생성자 1 -> B1생성자 2
    }
}