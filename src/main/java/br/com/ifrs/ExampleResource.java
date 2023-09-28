package br.com.ifrs;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class ExampleResource {
    @ConfigProperty(name = "ifrs.pw2")
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.getMensagem();
    }
}
