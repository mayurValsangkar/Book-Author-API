package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    BookRepository bookRepository = new BookRepository();

    public String addBook(Book book){
       return bookRepository.addBook(book);
    }

    public String addAuthor(Author author){
        return bookRepository.addAuthor(author);
    }

    public String getHighestNumberPagesBook(){
        return bookRepository.getHighestNumberPagesBook();
    }


    public void updateBookPages(String bookName, int extraPages){
        bookRepository.updateBookPages(bookName, extraPages);
    }


    public int findTopRatedBooks(int ratings){
        return bookRepository.findTopRatedBooks(ratings);
    }

}
