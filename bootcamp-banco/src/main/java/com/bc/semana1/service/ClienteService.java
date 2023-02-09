package com.bc.semana1.service;

import com.bc.semana1.entity.Cliente;

import java.util.List;

public interface ClienteService {

    String insertarCliente(Cliente cliente);
    List<Cliente> listarCliente();
    String actualizarCliente(Cliente cliente);
    String borrarCliente(Cliente cliente);
}
