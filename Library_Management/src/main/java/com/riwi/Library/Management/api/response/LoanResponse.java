package com.riwi.Library.Management.api.response;

import com.riwi.Library.Management.domain.entities.Book;
import com.riwi.Library.Management.domain.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {

    private Long id;

    private LocalDate loan_date;

    private Date return_date;

    private Boolean status;

    private User user_id;

    private Book book_id;
}
