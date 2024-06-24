package com.riwi.Library.Management.api.dtos.response;

import com.riwi.Library.Management.util.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String full_name;

    private UserRole role;

    private List<LoanResponse> loans;

    private List<ReservationResponse> reservations;
}
