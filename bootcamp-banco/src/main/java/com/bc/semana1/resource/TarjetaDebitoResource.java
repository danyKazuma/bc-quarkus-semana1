package com.bc.semana1.resource;

import com.bc.semana1.entity.TarjetaDebito;
import com.bc.semana1.service.TarjetaDebitoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/tarjetadebito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TarjetaDebitoResource {

    @Inject
    private TarjetaDebitoService service;


    @POST
    public String registrarTarjetaDebito(TarjetaDebito tarjetaDebito){
        return service.registrarTarjetaDebito(tarjetaDebito);
    }

    @PUT
    public String actualizarTarjetaDebito(TarjetaDebito tarjetaDebito){
        return service.actualizarTarjetaDebito(tarjetaDebito);
    }

    @GET
    public List<TarjetaDebito> listarTarjetaDebitoPorCliente(@QueryParam("numDocCliente") String numDocCliente){
        return service.listarTarjetaDebito(numDocCliente);
    }


}
