package com.nogotochki;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author d.v.semenov
 * @since 16.07.2020
 */
@Path("/get")
@RegisterRestClient(configKey="api")
public interface SimpleService {
    @GET
    @Path("")
    @Produces("application/json")
    String getByName();
}
