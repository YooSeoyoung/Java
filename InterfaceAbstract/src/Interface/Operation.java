package Interface;

//연산 인터페이스 예제
public interface Operation {
    int calculate(int a, int b);
}

class Add implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
class Subtract implements Operation{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}