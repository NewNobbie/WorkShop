package com.riwi.Library.Management.domain.entities;

import com.riwi.Library.Management.util.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "user")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String full_name;

    @Column(nullable = false)
    @Enumerated
    private UserRole role;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "user_id",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<Loan> loans;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "user_id",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<Reservation> reservations;

}
