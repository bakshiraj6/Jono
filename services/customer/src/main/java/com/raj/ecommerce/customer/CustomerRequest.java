package com.raj.ecommerce.customer;

public record CustomerRequest(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
}
