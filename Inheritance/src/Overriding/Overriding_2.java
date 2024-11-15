package Overriding;

class Animal{
    void cry(){
        System.out.println("...");
    }
}
class Bird extends Animal{
//    void cry(){
//        System.out.println("짹짹");
//    }

    @Override // 어노테이션
    //어노테이션 : 코드에 추가적인 정보를 제공하기 위한 메타 데이터
    //메타 데이터 : 주로 코드의 의미를 명확하게 하고 컴파일러에게 지시를 내리거나 특정 동작을 수행할 수 있도록 명령하는 코드

    //@Override 어노테이션 장점
    //1. 컴파일러가 오버라이딩 여부 검증
    //2. 개발자의 가독성을 향상해줌
    //3. 메서드 수정 시 실수를 방지해줌
    void cry() { //...
        super.cry(); // 강제로 부모 클래스의 메서드 사용
    }
}
class Cat extends Animal{
    @Override
    void cry(){
        System.out.println("야옹");
    }
}
class Dog extends Animal{
    void cry(){
        System.out.println("명멍");
    }

}

public class Overriding_2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat= new Cat();
        Dog dog= new Dog();
        animal.cry(); //...
        bird.cry(); //짹짹
        cat.cry(); //야옹
        dog.cry();//멍멍
        System.out.println();

        Animal animal1= new Bird();
        Animal animal2= new Cat();
        Animal animal3= new Dog();
        animal1.cry();//짹짹
        animal2.cry(); //야옹
        animal3.cry();//멍멍
        System.out.println();

        //배열 생성
        //부모클래스로 배열의 타입을 정의하면 자식 클래스들을 모드 배열화 할수 있음
        Animal[] animals={animal,bird,cat,dog,animal1,animal2,animal3};
        printCry(animals);
        }
        static void printCry(Animal[] animals){
        for(Animal animal: animals){ //for-each문 생성
            animal.cry();
        }
        }

    }

