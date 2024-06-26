package com.riwi.Library.Management.api.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

    private Long id;

    private String title;

    private String author;

    private Integer publication_year;

    private String genre;

    private String isbn;

    private List<LoanResponse> loans;

    private List<ReservationResponse> reservations;

}
