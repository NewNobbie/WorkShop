package com.riwi.Library.Management.api.dtos.request;

import com.riwi.Library.Management.domain.entities.Book;
import com.riwi.Library.Management.domain.entities.User;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanReq {

    @NotNull(message = "This attribute is required")
    @FutureOrPresent(message = "Loan return date must be in near future or today")
    @Size(max = 100, message = "Exceeded the maximum number of characters(100)")
    private Date return_date;

    @NotNull(message = "The attribute is required")
    private Boolean status;

    @NotNull(message = "User id is required")
    private User user_id;

    @NotNull(message = "Book id is required")
    private Book book_id;
}
