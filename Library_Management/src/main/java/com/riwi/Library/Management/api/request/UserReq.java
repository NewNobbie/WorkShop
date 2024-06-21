package com.riwi.Library.Management.api.request;

import com.riwi.Library.Management.util.enums.UserRole;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserReq {

    @NotBlank(message = "The username is required")
    @Size(max = 50, message = "Exceeded the maximum number of characters(50)")
    private String username;

    @NotBlank(message = "The password is required")
    @Size(max = 100, message = "Exceeded the maximum number of characters(100)")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", message = "The password must be min 8 characters, one minus & mayus letter & a number"
    )
    private String password;

    @Email(message = "Must be a email")
    @NotBlank(message = "The email is required")
    @Size(max = 100, message = "Exceeded the maximum number of characters(100)")
    private String email;

    @NotBlank(message = "The full_name is required")
    @Size(max = 100, message = "Exceeded the maximum number of characters(100)")
    private String full_name;

    @NotNull(message = "The role can't be null")
    private UserRole role;
}
