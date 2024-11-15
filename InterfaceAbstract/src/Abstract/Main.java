package Abstract;

public class Main {
    public static void main(String[] args) {
        //Calculator 예제
        Addition addition = new Addition();
        addition.displayResult(2,4); //6.0
        Multiply multiply = new Multiply();
        multiply.displayResult(2,4); //8.0
        //Shape 예제
        Shape circle = new Circle(5);
        System.out.println(circle.area()); //78.53981633974483
        Shape rectangle = new Rectangle(4,6);
        System.out.println(rectangle.area()); //24.0
        Square square1 = new Square(5);
        square1.area();
        //Payment
        Payment credit = new CreditCard(20000,"A001","1234-5678","2030-12-31");
        if(credit.processPayment()){ // 결제 진행 결과 여부에 따라 영수증 발행
            System.out.println(credit.getReceipt());
        }
        Payment mobile = new Mobile(50000,"A001","Kakaopay",true);
        if (mobile.processPayment()){
            System.out.println(mobile.getReceipt());
        }
        //Payment 연습
        Payment cash1 =new Cash(25000,"A001",40000);
        if(cash1.processPayment()){
            System.out.println(cash1.getReceipt());
        }
        Payment cash2 =new Cash(15000,"A001",10000);
        if(cash2.processPayment()){
            System.out.println(cash2.getReceipt());
        }

    }
}
