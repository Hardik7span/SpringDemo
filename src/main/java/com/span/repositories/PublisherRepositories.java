package com.span.repositories;

import com.span.spring.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositories extends CrudRepository<Publisher, Long> {
}
