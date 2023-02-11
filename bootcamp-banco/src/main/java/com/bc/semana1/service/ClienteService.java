package com.bc.semana1.service;

import com.bc.semana1.entity.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente insertarCliente(Cliente cliente);
    List<Cliente> listarCliente();
    Cliente actualizarCliente(Cliente cliente);
    void borrarCliente(Long idCliente);
    Cliente buscarClientePorDocumento(String clienteDocumento);

}
