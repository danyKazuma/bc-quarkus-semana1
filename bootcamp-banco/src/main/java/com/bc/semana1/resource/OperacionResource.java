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
    public Operacion registrarOperacion(Operacion operacion){
        return operacionService.insertarOperacion(operacion);
    }

    @PUT
    public void actualizarOperacion(Operacion operacion){
        operacionService.actualizarOperacion(operacion);
    }

    @DELETE
    @Path("{idOperacion}")
    public void deshabilitarOperacion(@PathParam("idOperacion") String idOperacion){
        operacionService.eliminarOperacion(Long.parseLong(idOperacion));
    }


}
