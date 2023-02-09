package com.bc.semana1.resource;

import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.service.CtaBancariaService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/ctabancaria")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CtaBancariaResource {

    @Inject
    private CtaBancariaService ctaBancariaService;

    @POST
    public String registrarCtaBancaria(CtaBancaria ctaBancaria){
        return ctaBancariaService.registrarCtaBancaria(ctaBancaria);
    }

    @GET
    @Path("/cliente")
    public List<CtaBancaria> buscarCtaBancariaCliente(@QueryParam("documentoCliente") String documentoCliente){
        return ctaBancariaService.listarCtaBancariaCliente(documentoCliente);
    }

    @GET
    @Path("/cta")
    public CtaBancaria buscarCtaBancaria(@QueryParam("numCtaBancaria") String numCtaBancaria){
        return ctaBancariaService.buscarCtaBancaria(numCtaBancaria);
    }

    @PUT
    public String actualizarCtaBancaria(CtaBancaria ctaBancaria) {
        return ctaBancariaService.actualizarCtaBancaria(ctaBancaria);
    }

    @DELETE
    public String eliminarCtaBancaria(String numCtaBancaria){
        CtaBancaria ctaBancaria= ctaBancariaService.buscarCtaBancaria(numCtaBancaria);
        return ctaBancariaService.eliminarCtaBancaria(ctaBancaria);
    }

}
