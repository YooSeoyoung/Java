package Abstract;
//도형 클래스
abstract public class Shape {
    abstract double area(); //도형의 면적을 구하는 추상메서드
}
class Circle extends Shape{
    //추상클래스의 자식클래스는 추상메서드를 오버라이드해야함 ( 강제성)
    // 단, 자식클래스만의 필드, 메서드 등을 자유롭게 정의할 수 있음!!
    //추가로 자식클래스만의 추상메서드를 정의하는 것도 가능함
   double radius;  // 자식 클래스만의 필드

     Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
//직사각형
class Rectangle extends Shape{
    double x; //가로길이
    double y; //세로길이

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        return x*y;
    }
}
//추가 연습
class Square extends Rectangle {
    public Square(double x) {
        super(x, x); //부모의 y값을 x값으로 초기화 하는 것
    }
    @Override
    double area() { // 부모의 area 메서드를 받고 있기 때문에 별도로 작성을 안해도되지만 명시적으로 작성함
        return x*x;
    }
}