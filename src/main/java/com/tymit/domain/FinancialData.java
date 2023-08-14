package com.tymit.domain;

import lombok.Data;
import lombok.Value;

@Data
public class FinancialData {
    String annualIncome;
    String employmentStatus;
    String residentialStatus;
    Integer dependants;
}