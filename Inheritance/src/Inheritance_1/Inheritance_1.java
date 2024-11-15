package Inheritance_1;

class Human{
    String name;
    int age;
    void eat(){}
    void sleep(){}
}
class Student extends Human{ //Human클래스를 상속 받았다 , Student a는 결국 Human a와 같다(즉, Human 데이터 타입으로 전환-> 업캐스팅)
    int studentID;             // 다운캐스팅은 하지 않기!!!! 그러면 데이터의 손실 발생
    void goToSchool(){}
}
class Worker extends Human{//Human클래스를 상속 받았다
    int workerID;
    void goToWork(){}
}

public class Inheritance_1 {
    public static void main(String[] args) {
        //1. human 객체 생성
        Human h = new Human();
        h.name="Steve";
        h.age=11;
        h.eat();
        h.sleep(); //studentID 인스턴스랑 gotoSchool 메서드 존재 x

        //2. Student 객체 생성
        Student s =new Student();
        s.name="Tom";
        s.age=16;
        s.studentID=128; // 학생만의 필드
        s.eat();
        s.sleep();
        s.goToSchool(); // 학생만의 메서드

        //3.Worker 객체 생성
        Worker w =new Worker();
        w.name="Sam";
        w.age=45;
        w.workerID=128;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
