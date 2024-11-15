package GenericClass;

class Goods{ // 느슨한 결합(더 유리함 -> 자유롭기 때문에)
    private Object object=new Object(); //필드  //모든 클래스를 담을 수 있음

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) { // 자바에 있는 모든 클래스를 다 매개 변수로 올 수 있음
        this.object = object;
    }
}

//모든 클래스의 부모인 Object를 이용하면 문제를 해결 할 수 있음
public class Generic_2 {
    public static void main(String[] args) {

        Goods goods1 = new Goods();
        goods1.setObject(new Apple()); // Apple이라는 클래스를 담기
        //getObject는 Object를 리턴하므로 Apple로 다운캐스팅 필요함
        Apple apple =(Apple)goods1.getObject(); // Apple 클래스를 꺼내기

        Goods goods2 =new Goods();
        goods2.setObject(new Pencil());
        Pencil pencil=(Pencil)goods2.getObject();

        //실수로 애플이 담겨있는 goods1 객체에서 pencil을 꺼냄==> 하지만 컴파일 에러 발생 x
        // 이유 : Object는 모든 클래스의 부모 클래스로서 모든 타입의 객체 저장 가능
        //자바의 특성상 Object는 약한 타입체크 방식으로 동작됨
        //자바의 특성상 Object는 엄격한(=강한) 타입체크가 이루어지지 않음
        //그러므로 컴파일시점에는 타입이 맞는지 여부를 확인할 수 없으며 런타임 시에  실제 타입 기반으로 확인하게 됨

        //타입 체크는 느슨한 타입체크보다는 엄격한 타입 체크가 유리하다 ( 이유 : 다운 캐스팅에 실수가 있을 수 있기 때문에)

        Pencil pencil1=(Pencil)goods1.getObject(); //약한 타입 체크

        //Object를 사용하는 방법은 하나의 클래스를 사용 가능하게 하고 이전의 문제(Generic_1.java)는 해결 가능하나,
        //타입변환 오류를 즉시 알 수 없는 단점이 있다!!!!!!
    }
}
