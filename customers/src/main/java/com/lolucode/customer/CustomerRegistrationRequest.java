package com.lolucode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
