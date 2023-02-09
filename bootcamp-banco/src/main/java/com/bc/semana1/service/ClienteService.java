package com.bc.semana1.service;

import com.bc.semana1.entity.Cliente;

import java.util.List;

public interface ClienteService {

    String insertarCliente(Cliente cliente);
    List<Cliente> listarCliente();
    Cliente actualizarCliente(Cliente cliente);
    boolean borrarCliente(Cliente cliente);
}
