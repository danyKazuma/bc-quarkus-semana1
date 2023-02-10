package com.bc.semana1.resource;

import com.bc.semana1.entity.TarjetaCredito;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import com.bc.semana1.service.TarjetaCreditoService;

@Path("/tarjetacredito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TarjetaCreditoResource {
    @Inject
    TarjetaCreditoService tarjetaCreditoService;

    @POST
    public String registrarTarjetaDebito(TarjetaCredito tarjetaCredito){
        return tarjetaCreditoService.registrarTarjetaCredito(tarjetaCredito);
    }
    @GET
    public String consultaSaldo(TarjetaCredito tarjetaCredito){
        return  tarjetaCreditoService.consultaSaldo(tarjetaCredito);
    }
    @POST
    @Path("/consultaCliente")
    public String consultaCliente(TarjetaCredito tarjetaCredito){
        return tarjetaCreditoService.consultaCliente(tarjetaCredito);
    }
}
