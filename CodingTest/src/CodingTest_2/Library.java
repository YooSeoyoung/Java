package CodingTest_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;// 도서관 이름
    private List<Book> books;// 도서 목록

    public Library(String name) {
        this.name = name;
        this.books= new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println("책 등록:"+ book.getTitle());
    }
    public void displayBooks(){
        for (int i = 0; i<books.size();i++){
            books.get(i).displayDetails();
        }
    }
    public void lendBook(String title) {
        for (Book book : books) {
            if (book instanceof PrintedBook) {
                ((PrintedBook) book).lend();
            } else if (book instanceof EBook) {
               ((EBook) book).access();
            }
            return;
        }
    }

    public void returnBook(String title){
        for (Book book : books) {
            if (book instanceof PrintedBook) {
                ((PrintedBook) book).returnBook();
            }
        }
    }
}
