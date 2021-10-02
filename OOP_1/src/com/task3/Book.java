package com.task3;

public class Book {

    Title title;
    Author author;
    Content content;

    Book(Title title, Author author, Content content){
        this.title = new Title();
        this.author = new Author();
        this.content = new Content();
    }

    public static void main(String[] args) {
        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        Book book = new Book(title,author,content);
        book.title.setText("AtlasShrugged");
        book.author.setText("AynRand");
        book.content.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit");

        book.title.show();
        book.author.show();
        book.content.show();
    }



}
