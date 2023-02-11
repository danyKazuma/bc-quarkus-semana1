package com.bc.semana1.service.impl;

import com.bc.semana1.entity.Cliente;
import com.bc.semana1.service.ClienteService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class ClienteServiceImpl implements ClienteService {

    @Transactional
    public Cliente insertarCliente(Cliente cliente) {
        cliente.setEstado(true);
        Cliente.persist(cliente);
        return cliente;
    }

    @Transactional
    public List<Cliente> listarCliente(){ return Cliente.listAll(); }

    public Cliente buscarClientePorDocumento(String clienteDocumento){
        return Cliente.find("numeroDocumento",clienteDocumento).firstResult();
    }

    @Transactional
    public void borrarCliente(Long idCliente){
        Cliente clie = Cliente.findById(idCliente);
        clie.setEstado(false);
        Cliente.persist(clie);
    }

    @Transactional
    public Cliente actualizarCliente(Cliente cliente){

        Cliente cli = Cliente.findById(cliente.id);
        cli.setNombre(cliente.getNombre());
        cli.setApellidoP(cliente.getApellidoP());
        cli.setApellidoM(cliente.getApellidoM());
        cli.setTipoDocumento(cliente.getTipoDocumento());
        cli.setNumeroDocumento(cliente.getNumeroDocumento());
        cli.setFechaDeNacimiento(cliente.getFechaDeNacimiento());

        Cliente.persist(cli);
        return cli;
    }
}
