package com.bc.semana1.resource;

import com.bc.semana1.entity.Cliente;
import com.bc.semana1.service.ClienteService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/cliente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource {

    @Inject
    ClienteService clienteService;

    @GET
    public List<Cliente> listarCliente(){ return clienteService.listarCliente(); }

    @POST
    public Cliente registrarCliente(Cliente cliente){ return clienteService.insertarCliente(cliente); }

    @PUT
    public Cliente actualizarCliente(Cliente cliente) { return clienteService.actualizarCliente(cliente); }

    @DELETE
    @Path("{idCliente}")
    public void borrarCliente(@PathParam("idCliente") String idCliente){ clienteService.borrarCliente(Long.parseLong(idCliente)); }

}
