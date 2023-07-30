package com.jpademo.repository;

import com.jpademo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassName: BookRepository
 * Package: com.jpademo.repository
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 30/07/2023
 */
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findBookByName(String name);
}
