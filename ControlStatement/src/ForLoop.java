public class ForLoop {
    public static void main(String[] args) {
        //가장 무난한 일반형~(10회 반복)
        for(int i=0; i<10;i++){// or i<=9 ,근데 명시적으로 10회 반복이라는 숫자가 정확하게 화면 상에 보이기 때문에 i<10이라고 쓴다
            System.out.print(i+"  ");
        }
        System.out.println("끝");
        System.out.println();

        //감소형(10회 반복)
        for(int i=10; i>0;i--){
            System.out.print(i+"  ");
        }
        System.out.println("끝");
        System.out.println();

        //증감식의 변화(2씩 증가)
        for (int i=0; i<10; i=i+2){
            System.out.print(i+"  ");
        }
        System.out.println("끝");
        System.out.println();

        //iterator(반복자)가 여러개인 경우
        for (int i=0,j=0;i<10;i++,j++){
            System.out.print(i+","+j+" ");
        }
        System.out.println("끝");

        //무한 루프
        int count=0;
        for (int i=0; ;i++){// 조건식이 없음
            System.out.println(i);
            count =i;
            if(count>1000000){
                break; //count가 100만원 넘으면 멈추자~
            }
        }
//        for ( ; ; ){ //무한 루프의 또 다른 예
//        }
//        for (int i=0;i>=0;i++){ //무한 루프의 또 다른 예, 조건식이 거짓이 될 수 없음
//            System.out.println(i);
//        }
        //System.out.println("끝");
    }
}
