package com.jpademo.controller;

import com.jpademo.entity.Book;
import com.jpademo.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: BookController
 * Package: com.jpademo.controller
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 30/07/2023
 */
@RestController
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("books")
    List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("books/{name}")
    public Book findBookByName(@PathVariable("name") String name){
        return bookRepository.findBookByName(name);
    }


}
