package GenericMethod;
class AAA{
    public <T> void method(T t){
        //T는 어떤 클래스가 올지 모르므로 특정클래스의 내부메서드 사용 불가
        //System.out.println(t.length());//오류 발생 (String의 내부 메서드)
        //T는 Object클래스의 자식이다라는 명제는 참
        // 그러므로 T에 Object의 내부메서드는 사용할 수 있음
        //T는 Object의 자식클래스이기 때문
        // T가 String인지 아닌지 모르기 때문에 에러 발생

        System.out.println(t.toString());
        System.out.println(t.equals("AAA"));
        System.out.println(t.hashCode());

    }
}

public class GenericMethod_2 {
}
