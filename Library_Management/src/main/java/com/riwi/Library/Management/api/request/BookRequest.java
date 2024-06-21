package com.riwi.Library.Management.api.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {

    @NotBlank(message = "The title is required")
    @Size(max = 100, message = "Exceeded the maximum number of characters(100)")
    private String title;

    @NotBlank(message = "The author is required")
    @Size(max = 100, message = "Exceeded the maximum number of characters(100)")
    private String author;

    @NotNull(message = "Publication can't be null")
    private Integer publication_year;

    @NotBlank(message = "The genre is required")
    @Size(max = 50, message = "Exceeded the maximum number of characters(50)")
    private String genre;

    @NotBlank(message = "The isbn is required")
    @Size(max = 20, message = "Exceeded the maximum number of characters(20)")
    private String isbn;

    private List<LoanReq> loans;

    private List<ReservationReq> reservations;

}
