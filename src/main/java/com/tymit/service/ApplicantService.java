package com.tymit.service;

import com.tymit.domain.*;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class ApplicantService {
    private List<Applicant> applicants = new ArrayList<>();

    public ApplicantService() {
        AuthDetails authDetails = new AuthDetails();
        authDetails.setPhone("+44771234567");
        authDetails.setEmail("john@mail.com");
        authDetails.setDeviceId("4567-asdf-q23r4-123r23");
        authDetails.setPassword("1234");

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setName("John");
        personalDetails.setSurname("Dick");
        personalDetails.setBirthdate("1980-01-01");

        List<Address> addresses = new ArrayList<>();
        Address address = new Address();
        address.setCountry("United Kingdom");
        address.setCity("London");
        address.setFlatNumber("2");
        address.setStreet("St. Louis");
        address.setPostcode("SW 3F2");
        address.setLivingSince(Instant.now());
        addresses.add(address);

        Applicant applicant = setApplicant(authDetails, personalDetails, addresses);

        applicants.add(applicant);
    }

    private static Applicant setApplicant(AuthDetails authDetails, PersonalDetails personalDetails, List<Address> addresses) {
        FinancialData financialData = new FinancialData();
        financialData.setAnnualIncome("100000");
        financialData.setEmploymentStatus("EMPLOYEE");
        financialData.setResidentialStatus("OWNER");
        financialData.setDependants(2);

        Applicant applicant = new Applicant();
        applicant.setAuthDetails(authDetails);
        applicant.setPersonalDetails(personalDetails);
        applicant.setAddresses(addresses);
        applicant.setFinancialData(financialData);
        return applicant;
    }

    public List<Applicant> getApplicantByPhone(String phone) {
        return applicants.stream()
                .filter(applicant -> applicant.getAuthDetails().getPhone().equals(phone))
                .collect(Collectors.toList());
    }
}
