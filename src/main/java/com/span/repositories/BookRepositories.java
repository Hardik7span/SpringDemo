package com.span.repositories;

import com.span.spring.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book,Long> {
}
