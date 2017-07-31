package HWLesson1;

import java.util.*;

abstract class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}


class MyBook extends Book{

    String author;
    String title;
    int price;

    MyBook(String title, String author, int price){
       super(title,author);
       this.title = super.title;
       this.author = super.author;

       this.price = price;
    }

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}

 class Solution {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String title = "one";
        String author = "two";
        int price = 10;
        //scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
