package Abstract;
//내부에 추상메서드가 한개라도 포함된 클래스에는 반드시 abstract 키워드를 클래스에 정의해야함!!
abstract class Animal{
   abstract void cry();
   //추상 메서드는 중괄호 대신에 ;로 대체한다(본체가 없다는 뜻)
    //미완성이므로 cry 메서드는 반드시 오버라이드해야함
}
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}
public class Abstract_2 {
    public static void main(String[] args) {
        //Animal animal=new Animal(); ->추상클래스 자체는 인스턴스화 불가능 (미완성 클래스이자 미완선 메서드이기 때문에)
        Animal animal1= new Cat();
        Animal animal2= new Dog();

        animal1.cry();
        animal2.cry();
    }
}
