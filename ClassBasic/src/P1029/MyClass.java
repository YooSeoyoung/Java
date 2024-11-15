package P1029;

import java.util.Date;

public class MyClass {
    public static void main(String[] args) {
        Student Steve = new Student("Steve",25);
        Student Tom = new Student();
        Student Sam = new Student("Sam", 25,"대전",
                "남", 100,90,80);

        System.out.println(Steve.name);
        System.out.println(Steve.address);
        System.out.println(Tom.name);
        System.out.println(Sam.name);
        System.out.println(Sam.scoreHistory);
        //메서드의 사용
        //외부클래스가 가지고 있는 메서드이므로 해당 클래스의 인스턴스를 명시해야함!!!
        System.out.println(Steve.sumScore());
        System.out.println(Tom.sumScore());
        System.out.println(Sam.sumScore());

        User kim = new User("Kim", "kim@gmail.com","1234");
        System.out.println(kim.password);
        kim.setPassword("abcd");
        System.out.println(kim.password);

        Product book1= new Product("a001","여행", 10000,100);
        System.out.println(book1.price + " "+ book1.stock);
        book1.setPrice(11000);
        book1.setStock(90);
        System.out.println(book1.price + " "+ book1.stock);

        //주문 생성
        Order order1= new Order("1029-001", kim, book1, new Date(), 3);
        System.out.println(order1.user.username);
        System.out.println(order1.product.name);
        System.out.println(order1.orderDate);

    }
}
