package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    BookService bookService = new BookService();

    @PostMapping("/add-book")
    public ResponseEntity addBook(@RequestBody Book book){
        String message = bookService.addBook(book);
        return new ResponseEntity(message, HttpStatus.CREATED);
    }

    @PostMapping("/add-author")
    public ResponseEntity addAuthor(@RequestBody Author author){
        String message = bookService.addAuthor(author);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    public ResponseEntity getHighestNumberPagesBook(){
        String bookName = bookService.getHighestNumberPagesBook();
        return new ResponseEntity<>(bookName, HttpStatus.CREATED);
    }


    public ResponseEntity updateBookPages(String bookName, int extraPages){
        bookService.updateBookPages(bookName, extraPages);
        return new ResponseEntity<>("Pages Updated Successfully", HttpStatus.CREATED);
    }


    public ResponseEntity findTopRatedBooks(int ratings){
        int books = bookService.findTopRatedBooks(ratings);
        return new ResponseEntity<>(books, HttpStatus.CREATED);
    }
}
