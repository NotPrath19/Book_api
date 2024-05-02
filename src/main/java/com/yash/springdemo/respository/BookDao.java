package com.yash.springdemo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.springdemo.model.Book;

@Repository
public interface BookDao extends JpaRepository<Book,Long> {

}
