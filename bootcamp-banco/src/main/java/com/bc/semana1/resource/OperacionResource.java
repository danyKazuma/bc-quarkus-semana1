package com.bc.semana1.resource;

import com.bc.semana1.entity.Operacion;
import com.bc.semana1.service.OperacionService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/operacion")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class OperacionResource {

    @Inject
    private OperacionService operacionService;

    @GET
    public List<Operacion> listarOperaciones(){
        return operacionService.listarOperaciones();
    }

    @POST
    public String registrarOperacion(Operacion operacion){
        return operacionService.insertarOperacion(operacion);
    }

    @PUT
    public String deshabilitarOperacion(Operacion operacion){
        return operacionService.actualizarOperacion(operacion);
    }

}
