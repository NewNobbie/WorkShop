package com.riwi.Library.Management.domain.repositories;

import com.riwi.Library.Management.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book , Long> {
}
