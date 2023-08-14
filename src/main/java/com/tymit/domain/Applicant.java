package com.tymit.domain;

import lombok.Data;

import java.util.List;

@Data
public class Applicant {
    AuthDetails authDetails;
    PersonalDetails personalDetails;
    List<Address> addresses;
    FinancialData financialData;

}
