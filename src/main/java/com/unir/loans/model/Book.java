package com.unir.loans.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Book {
    private String id;
    private String name;
    private String genre;
    private String author;
    private Integer pages;
    private String summary;
}
