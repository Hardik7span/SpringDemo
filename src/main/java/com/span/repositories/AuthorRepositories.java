package com.span.repositories;

import com.span.spring.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author,Long> {
}
