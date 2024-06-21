package com.riwi.Library.Management.api.request;

import com.riwi.Library.Management.domain.entities.Book;
import com.riwi.Library.Management.domain.entities.User;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationReq {


    @NotNull(message = "The created date is required")
    private LocalDate reservation_date;

    @NotNull(message = "This attribute is required")
    private Boolean status;

    @NotNull(message = "The user id is required ")
    private User user_id;

    @NotNull(message = "The Book id is required ")
    private Book book_id;
}
