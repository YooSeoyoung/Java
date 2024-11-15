package Modifier_1.pack1;


public class A { // 하나의 패키지에는 필수적으로 하나의 public이 필요하기 때문에 하나의 클래스만 만든다면 무조건 public을 써야된다 ( 거의 강제이다 ^^)/현재는 default는 불가능하다
    public int a=1; //모든 클래스가 읽을 수있음
    protected  int b=2;// 같은 패키지만 가능 ( 하지만 상속을 했을 경우 가능)
    int c =3; // 아무것도 안썼기 때문에 default이다 // 같은 패키지만 가능
    private int d =4;//A클래스에서만 가능함 // 상수( 즉, 변하지 않은 값)
   public void print(){ //public을 안하게 default로 분류가 되기 때문에 A클래스에서는 사용이 불가능 함(다른 패키지의 클래스이기 때문에)
        System.out.print(a +" ");
        System.out.print(b +" ");
        System.out.print(c +" ");
        System.out.print(d +" ");//print메서드가 public이기 때문에 가능 // print메서드에 private d를 호출을 하기(같은 클래스이기 때문에 가능함)
        System.out.println();
       //bcd는 다른 패키지에서는 안보이기 때문에 해당 값을 읽기 위해서는 public을 가지고 있는 메서드 통해 엑세스를 해야된다.
       //외부패키지에서 읽은 수 없는 bcd는 public 메서드를 통해서만 엑세스 가능
    }
}
