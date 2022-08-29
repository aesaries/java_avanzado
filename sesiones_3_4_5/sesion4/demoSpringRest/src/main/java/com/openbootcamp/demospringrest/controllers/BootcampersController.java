package com.openbootcamp.demospringrest.controllers;

import com.openbootcamp.demospringrest.models.Bootcamper;
import com.openbootcamp.demospringrest.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Juan", 20, "Arg"));
        this.bootcamperService.add(new Bootcamper("Pedro", 25, "Col"));
        this.bootcamperService.add(new Bootcamper("Ana", 34, "Bol"));
        this.bootcamperService.add(new Bootcamper("Maria", 18, "Ecu"));
        this.bootcamperService.add(new Bootcamper("Enzo",40, "Arg"));

    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre) {
        return bootcamperService.get(nombre);
    }


    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build();
    }
}
