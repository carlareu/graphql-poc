package com.tymit.resource;

import com.tymit.domain.Applicant;
import com.tymit.service.ApplicantService;
import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class ApplicantResource {
    @Inject
    ApplicantService applicantService;

    @Query("applicantByPhone")
    @Description("Get the applicant by phone")
    public List<Applicant> getApplicantByPhone(@Name("phone") String phone) {
        return applicantService.getApplicantByPhone(phone);
    }
}
