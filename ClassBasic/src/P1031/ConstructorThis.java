package P1031;

public class ConstructorThis {
    public static void main(String[] args) {
        E1 e1= new E1(3,5);
        e1.print();
        //클래스의 필드와 메서드의 지역변수가 같으면 필드를 지역변수로 인식하므로 명시적 this를 사용하여 필드를 표시해야 함(this.필드)
        E2 e2= new E2();
        e2.print();
        E2 e2_1= new E2(10);
        e2_1.print(); //m1만 10으로 초기화
        E2 e2_2 =new E2(20,30);
        e2_2.print();// 20 30 3 4

    }
}
class E1{
    int m;
    int n;
    E1(int m, int n){
        m=m;
        this.n=n;
    }
    void print(){
        System.out.println(m +" "+n);
    }
}
class E2{
    int m1; //1로 변경
    int m2; //2로 변경
    int m3; //3로 변경
    int m4; //4로 변경
    E2(){
        this.m1=1;
        this.m2=2;
        this.m3=3;
        this.m4=4;

    }
    E2(int m1){
        this(); //-> E2() 호출 //미사용 시 ,10 0 0 0 출력
        this.m1 =m1;
    }
    void print(){
        System.out.println(m1+" "+m2+" "+m3+" "+m4);
    }
    E2(int m1, int m2){
        this(m1);
        this.m2 = m2;
    }
}
