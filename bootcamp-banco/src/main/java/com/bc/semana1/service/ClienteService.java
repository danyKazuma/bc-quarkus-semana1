package com.bc.semana1.service;

import com.bc.semana1.entity.Cliente;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

//@Path("/extensions")
//@RegisterRestClient
public interface ClienteService {

    String insertarCliente(Cliente cliente);
    List<Cliente> listarCliente();
    Cliente actualizarCliente(Cliente cliente);
    boolean borrarCliente(Cliente cliente);

//    @GET
//    @Path("/stream")
//    boolean buscarClientePorDocumento(@QueryParam("clienteDocumento") String clienteDocumento);
}
