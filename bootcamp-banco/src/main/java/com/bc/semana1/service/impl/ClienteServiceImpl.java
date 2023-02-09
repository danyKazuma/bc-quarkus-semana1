package com.bc.semana1.service.impl;

import com.bc.semana1.entity.Cliente;
import com.bc.semana1.repository.ClienteRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class ClienteServiceImpl {

    @Inject
    ClienteRepository clienteRepository;


    @Transactional
    public String insertarCliente(Cliente cliente) {
        clienteRepository.persist(cliente);
        return "Registro Satisfactorio";
    }

    @Transactional
    public List<Cliente> listarCliente(){ return clienteRepository.listAll(); }

    @Transactional
    public String buscarCLiente(Cliente cliente){
        Cliente findCliente = clienteRepository.findById(cliente.getLId());
        if(findCliente!=null){
            clienteRepository.persistAndFlush(cliente);
        }else{
            return "Cliente no encontrado";
        }
        return "Cliente encontrado";
    }

    @Transactional
    public boolean borrarCliente(Cliente cliente){ return clienteRepository.deleteById(cliente.getLId()); }

    @Transactional
    public Cliente actualizarCliente(String id,Cliente cliente){

        Cliente actualizar = clienteRepository.findById(cliente.getLId());
        if (actualizar==null){
            throw new WebApplicationException("Cliente con el id " + id + " no existe.", 404);
        }
        if(cliente.sNombre!=null) actualizar.sNombre=cliente.getSNombre();
        if(cliente.sApellidoP!=null) actualizar.sApellidoP=cliente.getSApellidoP();
        if(cliente.sApellidoM!=null) actualizar.sApellidoM=cliente.getSApellidoM();
        if(cliente.sNumeroDocumento!=null) actualizar.sNumeroDocumento=cliente.getSNumeroDocumento();
        if(cliente.sEstado!=null) actualizar.sEstado=cliente.getSEstado();

        return actualizar;

    }
}
