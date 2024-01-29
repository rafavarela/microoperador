package com.unir.loans.model.db;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "loans")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @Column(name = "book_id")
    private List<String> books;
}
