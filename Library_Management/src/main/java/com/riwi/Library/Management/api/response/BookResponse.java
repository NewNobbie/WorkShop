package com.riwi.Library.Management.api.response;

import com.riwi.Library.Management.api.request.LoanReq;
import com.riwi.Library.Management.api.request.ReservationReq;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponse {

    private Long id;

    private String title;

    private String author;

    private Integer publication_year;

    private String genre;

    private String isbn;

    private List<LoanReq> loans;

    private List<ReservationReq> reservations;

}
