package com.riwi.Library.Management.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity(name = "book")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private Integer publication_year;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String isbn;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "book_id",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<Loan> loans;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "book_id",
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<Reservation> reservations;
}
