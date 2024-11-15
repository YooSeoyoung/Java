public class IfControlStatement {
    public static void main(String[] args) {
        int value = 5;
        if (value > 3) {
            System.out.println("실행1");// 실행됨
        }
        if (value < 5) {
            System.out.println("실행2"); //실행 안됨
        }
        boolean bool1 = true;
        boolean bool2 = false;
        if (bool1) {
            System.out.println("실행3");// 실행됨
        }
        if (bool2) {
            System.out.println("실행4");//실행됨
        }

        int value2 = 5;
        //if-else문
        if (value2 > 3) {
            System.out.println("실행5");
        } else {
            System.out.println("실행6");
        }

        System.out.println((value2 > 3) ? "실행5" : "실행6");
        System.out.println();

        //else-if문
        int value3 = 85;
        if (value3 >= 90) {
            System.out.println("A학점");
        } else if (value3 >= 80) {
            System.out.println("B학점");//실행 후 탈출, 밑에 있는 조건은 실행하지 않음
        } else if (value3 >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("F학점");// 위에 있는 모든 조건문이 모두 거짓일 때만 옴
        }
        if (value3 >= 70) {
            System.out.println("C학점");
        } else if (value3 >= 80) {
            System.out.println("B학점");
        } else if (value3 >= 90) {
            System.out.println("A학점");
        } else {
            System.out.println("F학점");
        }
        if(value3>=70&& value3<80){
            System.out.println("C학점");
        } else if (value3>=80&&value3<90) {
            System.out.println("B학점");
        } else if (value3>=90) {
            System.out.println("A학점");
        }else {
            System.out.println("F학점");
        }
    }
}
