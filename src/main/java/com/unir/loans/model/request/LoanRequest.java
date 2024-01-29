package com.unir.loans.model.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequest {
    @NotNull(message = "`books` cannot be null")
    @NotEmpty(message = "`books` cannot be empty")
    private List<String> books;
}
