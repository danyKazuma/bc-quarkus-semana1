package com.bc.semana1.resource;

import com.bc.semana1.entity.TarjetaCredito;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import com.bc.semana1.service.TarjetaCreditoService;

import java.util.List;

@Path("/tarjetacredito")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TarjetaCreditoResource {
    @Inject
    private TarjetaCreditoService service;

    @POST
    public TarjetaCredito registrarTarjetaDebito(TarjetaCredito tarjetaCredito){
        return service.registrarTarjetaCredito(tarjetaCredito);
    }
    @GET
    public TarjetaCredito consultaSaldoTarjetaCredito(@QueryParam("numeroTarjetaCredito") String numeroTarjetaCredito){
        return  service.consultaSaldoTarjetaCredito(numeroTarjetaCredito);
    }
    @GET
    @Path("/consultacliente")
    public List<TarjetaCredito> consultaCliente(@QueryParam("numDocumentoCliente") String numDocumentoCliente){
        return service.consultaCliente(numDocumentoCliente);
    }

    @DELETE
    @Path("{numeroTarjetaCredito}")
    public void eliminarTarjetaCredito(@PathParam("numeroTarjetaCredito") String numeroTarjetaCredito){
        service.eliminarTarjetaCredito(numeroTarjetaCredito);
    }
}
