package TypeCasting;

class C{}
class D extends C{} //C클래스에 상속

public class TypeCasting_2 {
    public static void main(String[] args) {

        C value1= new C(); //부모클래스 C의 인스턴스
        C value2= new D(); //자식클래스 D의 인스턴스를 부모인 C로 타입 변환(업캐스팅)

        System.out.println(value1 instanceof C); //true
        System.out.println(value2 instanceof C); //true(D이지만 D는 결국 B의 자식 클래스이기 때문에 D==C이기 때문에)
        System.out.println(value1 instanceof D); // false
        System.out.println(value2 instanceof D); // true
        //instanceof는 뒤에 적는 클래스의 특징(=속성)을 가지고 있는지 물어보는 키워드

        if(value1 instanceof D){ //false value1은 C의 속성만 지니고 있음
            D d = (D)value1; // C->D로 다운캐스팅
            System.out.println("value1을 D로 다운캐스팅");
        }else {
            System.out.println("value1은 D로 다운캐스팅 불가!!");
        }
        if(value2 instanceof D){ //true value2 C이지만 D의 속성도 가지고 있기 때문에
            D d= (D)value2; //C->D로 다운 캐스팅 성립 (O)
            System.out.println("value2을 D로 다운캐스팅");
        }else {
            System.out.println("value2을 D로 다운캐스팅 불가!!");
        }
        //객체의 실제 타입을 직접적으로 알 수 있는 방법
        System.out.println(value1.getClass().getName());
        System.out.println(value2.getClass().getName());
        //instanceof는 상속관계를 포함하고 있음
        //getClass().getName()은 상속관계를 무시하고 정확히 동일한 클래스만을 리턴

        if ("안녕" instanceof String){
            System.out.println("\"안녕\"은 String 클래스입니다.");
        }

    }
}
