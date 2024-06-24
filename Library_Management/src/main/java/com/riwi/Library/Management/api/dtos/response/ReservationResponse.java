package com.riwi.Library.Management.api.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResponse {

    private Long id;

    private LocalDate reservation_date;

    private Boolean status;

    private UserBasicResponse user_id;

    private BookResponse book_id;

}
