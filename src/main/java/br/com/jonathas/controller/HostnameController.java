package br.com.jonathas.controller;

import br.com.jonathas.model.HostnameResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@Path("host")
public class HostnameController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HostnameResponse getHost() throws UnknownHostException {
        HostnameResponse response = new HostnameResponse();
        response.setHostname(Inet4Address.getLocalHost().getHostName());
        response.setDateLocalTime(LocalDateTime.now());
        return response;
    }
}
