package dev.pw2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/config")
public class ConfigService {

    @ConfigProperty(name = "Ifrs.pw2", defaultValue = "")
    private String message;

    @GET
    @Path("get")
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return message;
    }
}