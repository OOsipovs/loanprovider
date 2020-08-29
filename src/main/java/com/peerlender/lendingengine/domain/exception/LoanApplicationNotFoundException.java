package com.peerlender.lendingengine.domain.exception;

public class LoanApplicationNotFoundException extends RuntimeException {

    public LoanApplicationNotFoundException(Long loanApplicationId) {
        super("Loan application with Id= " + loanApplicationId + " was not find!");
    }
}
