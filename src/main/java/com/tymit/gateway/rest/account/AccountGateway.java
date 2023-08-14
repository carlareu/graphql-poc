package com.tymit.gateway.rest.account;

import com.tymit.gateway.rest.account.dto.AccountDto;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient(configKey = "account-api")
@RegisterClientHeaders
public interface AccountGateway {

    @GET
    @Path("/api/account/{phone}")
    @Produces(MediaType.APPLICATION_JSON)
    Uni<List<AccountDto>> getAccount(@PathParam(value = "phone") String phone);
}
