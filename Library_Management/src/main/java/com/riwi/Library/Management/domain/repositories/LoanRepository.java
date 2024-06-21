package com.riwi.Library.Management.domain.repositories;

import com.riwi.Library.Management.domain.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan , Long> {
}
