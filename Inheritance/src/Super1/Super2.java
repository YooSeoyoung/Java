package Super1;

class AA{
    AA(){ //AA기본 생성자
        System.out.println("A생성자");
    }
}
class BB extends AA{ //AA클래스의 자식
    BB(){ //BB기본 생성자
        super(); // super메서드 ( 부모의 생성자) / 매개변수 없기 때문에 위에 있는 AA()생성자 //이 코드를 명시적으로 호출하지 않아도 컴파일러가 자동으로 생성
        //부모의 기본생성자는 자동으로 호출되기 때문에 항상 자식클래스의 영역에는 부모클래스의 영역이 생성됨
        System.out.println("B생성자");
    }
}
class CC { // 기본 생성자가 없는 상태임
    CC(int a){ //기본 생성자 없이 매개변수 1개인 생성자 가지고 있음
        System.out.println("C생성자");

    }
}
class DD extends CC{
    //이 경우, DD는 반드시 생성자를 선언해줘야함
    // 자동으로 생성되는 기본 생성자는 부모의 기본생성자를 필요로 하기 때문임

    DD(){
        super(3); //super메서드(부모의 생성자) / CC생성자가 매개변수가 있기 때문에 매개변수를 입력하여 호출해야된다(없으면 에러)
        //DD(){} 자동 생성 ( 그 안에 super() 자동 생성을 하는데 CC가 기본생성자가 없기 대문에 에러 발생!!!!
    }
}


public class Super2 {
    public static void main(String[] args) {
        BB value1 = new BB(); //A생성자 /B생성자 두줄 출력
        System.out.println();

        AA value2 =new AA();



    }
}
