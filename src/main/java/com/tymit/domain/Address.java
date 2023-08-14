package com.tymit.domain;


import lombok.Data;

import java.time.Instant;

@Data
public class Address {
    String country;
    String postcode;
    String flatNumber;
    String houseName;
    String houseNumber;
    String street;
    String city;
    Instant livingSince;
}