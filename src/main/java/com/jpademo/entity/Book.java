package com.jpademo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * ClassName: Book
 * Package: com.jpademo.entity
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 30/07/2023
 */
@Entity(name="Book")
public class Book {
    @Id
    private int id;
    private String name;
    private String isbn;
    private String datePublished;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }
}
