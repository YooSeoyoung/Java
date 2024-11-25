package GenericClass;

class Triple<A,B,C>{
    private A first;
    private B second;
    private C third;

    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public A getFirst() { return first; }
    public B getSecond() { return second;}
    public C getThird() { return third; }
}
//제네릭 타입이 3개인 경우 예제
public class Generic_6 {
    public static void main(String[] args) {
        Triple<String,Integer,Double> triple = new Triple<>("apple",3,1.54); // 기본 생성자를 안만들었기 때문에 괄호 안에 A,B,C 내용 작성 필요
        String fruit = triple.getFirst();
        Integer count = triple.getSecond();
        Double weight = triple.getThird();
        System.out.println(fruit + " "+ count+" "+weight);
    }
}
