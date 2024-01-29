package com.unir.loans.controller;

import com.unir.loans.model.db.Loan;
import com.unir.loans.model.request.LoanRequest;
import com.unir.loans.service.LoansService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoansController {

    private final LoansService service;

    @PostMapping("/loans")
    public ResponseEntity<Loan> createLoan(@RequestBody @Valid LoanRequest request) {

        log.info("Creating loan...");
        Loan loanCreated = service.createLoan(request);

        if (loanCreated != null) {
            return ResponseEntity.ok(loanCreated);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/loans")
    public ResponseEntity<List<Loan>> getLoans() {
        List<Loan> loans = service.GetLoans();

        return ResponseEntity.ok(Objects.requireNonNullElse(loans, Collections.emptyList()));
    }

    @GetMapping("/loans/{id}")
    public ResponseEntity<Loan> getOrder(@PathVariable String id) {
        Loan loan = service.getLoan(id);

        if (loan != null) {
            return ResponseEntity.ok(loan);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
