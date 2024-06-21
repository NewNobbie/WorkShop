package com.riwi.Library.Management.api.response;

import com.riwi.Library.Management.util.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
