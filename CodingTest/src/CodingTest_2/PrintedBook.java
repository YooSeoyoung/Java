package CodingTest_2;

public class PrintedBook extends Book {
    private int pageCount; //책 페이지 수
    private boolean isLent; // 대출 여부

    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
        this.isLent=false;
    }
    public boolean isLent(){
      return isLent;
    }
    public void lend(){
        if(isLent){
            System.out.println(getTitle()+"이미 대출중입니다.");
        }else {
            System.out.println(getTitle() + "은 성공적으로 대출 처리되었습니다.");
            isLent = true;
        }
    }
    public void returnBook(){
        if(!isLent){
            System.out.println(getTitle()+"은 대출중이 아닙니다.");
        }else {
            isLent =false;
            System.out.println(getTitle() + "은 성공적으로 반납되었습니다.");
        }
    }

    @Override
    void displayDetails() {
        System.out.println("Printed Book - 제목 : "+ getTitle() +",저자: "+ getAuthor()+ ",페이지: "+ pageCount+ ",대출여부: "+ isLent);
    }
}
