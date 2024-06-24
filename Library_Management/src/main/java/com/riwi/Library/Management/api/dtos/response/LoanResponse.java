package com.riwi.Library.Management.api.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private UserBasicResponse user_id;

    private BookResponse book_id;
}
