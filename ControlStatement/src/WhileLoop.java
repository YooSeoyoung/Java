public class WhileLoop {
    public static void main(String[] args) {
        //while 반복문
        //증감식이 실행코드의 일부이기 때문에 잘못 작성하거나 잊고 작성하지
        //않는 경우가 많음. 주의!!!
        //For문에 비해 구조가 안정적이지 못해 많이 사용되지 않음
        int i=0;
        while (i<10){ //처음부터 false면 아래 실행 문구 자체를 실행하지 않음
            System.out.println(i);
            i++;
        }
        //do-while 반복문
        int a=0;
        do{ //처음부터 false라도 실행문구가 조건식보다 앞에 나와있으므로 1회는 실행
            System.out.println(a);
            a++;
        }while (a<10);

        //while문과 do-while문의 차이점
        //조건식이 처음부터 false인 경우, while문은 코드가 실행되지 않으나,
        //do-while문은 1회 실행됨 / 실행코드가 조건식보다 더 위에 있기 때문!!!!!
        a=0;
        do{ //처음부터 false라도 실행문구가 조건식보다 앞에 나와있으므로 1회는 실행
            System.out.println(a);
            a++;
        }while (false);
    }
}
