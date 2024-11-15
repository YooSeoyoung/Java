public class BreakContinue {
    public static void main(String[] args) {
        //break문
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        //이중for문의 break
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    break;
                }
                System.out.println("i=" + i + ", j=" + j);// i=0, j=0 형식으로 로깅

            }
        }
        //이중 for문에서 바깥 for문까지 한번에 탈출할려면...

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    //바깥 for문의 조건을 거짓으로 만들도록 i값을 크게 변경
                    i = 100;
                    break;//100은 의미없음, 3보다 매추 큰 수로 세팅(가독송)
                }
            System.out.println("i=" + i + ", j=" + j);// i=0, j=0 형식으로 로깅
        }
    }

        //continue
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j == 2) {
                       continue;
                    }
                System.out.println("i=" + i + ", j=" + j);// i=0, j=0 형식으로 로깅
            }
        }
    }
}

