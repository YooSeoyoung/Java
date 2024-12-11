package CodingTest_2;

public class EBook extends Book {
    private double fileSize; //파일크기
    private int accessCount;// 조회 횟수

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
        this.accessCount=0;
    }
    public void access(){
       accessCount=accessCount+1;
            System.out.println(getTitle()+"조회 횟수 : "+ accessCount);
    }

    @Override
    void displayDetails() {
        System.out.println("EBook- 제목:"+getTitle()+",저자:"+getAuthor()+",파일사이즈 :"+ fileSize+"MB, 조회 횟수 :"+ accessCount);
    }
}
