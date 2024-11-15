package GenericClass;

class Apple{}
class Goods1{
    private Apple apple =new Apple();
    public Apple getApple(){
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
}
class Pencil{}
class Goods2{
    private Pencil pencil = new Pencil();

    public Pencil getPencil() {
        return pencil;
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }
}

public class Generic_1 {
    public static void main(String[] args) {
        Goods1 goods1= new Goods1();
        goods1.setApple(new Apple());
        Apple apple = goods1.getApple();

        Goods2 goods2 =new Goods2();
        goods2.setPencil(new Pencil());
        Pencil pencil = goods2.getPencil();
        //goods1.setApple(new Pencil()); //goods1에는 연필 객체를 담을 수 없음
        // 모든 상품마다 하나의 goods 클래스를 만들어서 담아야된다는  단점이 있음

    }
}
