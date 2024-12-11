package CodingTest_2;

public abstract class Book {
    private String title;// 책 제목
    private String author; // 저자

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    abstract void displayDetails(); //책정보 출력
}
