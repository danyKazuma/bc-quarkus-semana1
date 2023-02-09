package com.bc.semana1.service.impl;

import com.bc.semana1.entity.Cliente;
import com.bc.semana1.repository.ClienteRepository;

import com.bc.semana1.service.ClienteService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;

import java.util.List;

@ApplicationScoped
public class ClienteServiceImpl implements ClienteService {

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
        Cliente findCliente = clienteRepository.findById(cliente.getId());
        if(findCliente!=null){
            clienteRepository.persistAndFlush(cliente);
        }else{
            return "Cliente no encontrado";
        }
        return "Cliente encontrado";
    }

    @Transactional
    public boolean borrarCliente(Cliente cliente){ return clienteRepository.deleteById(cliente.getId()); }

    @Transactional
    public Cliente actualizarCliente(Cliente cliente){

        Cliente actualizar = clienteRepository.findById(cliente.getId());
        if (actualizar==null){
            throw new WebApplicationException("Cliente con el id " + cliente.getId() + " no existe.", 404);
        }

        if(cliente.estado){
            if(cliente.nombre!=null) actualizar.nombre=cliente.getNombre();
            if(cliente.apellidoP!=null) actualizar.apellidoP=cliente.getApellidoP();
            if(cliente.apellidoM!=null) actualizar.apellidoM=cliente.getApellidoM();
            if(cliente.numeroDocumento!=null) actualizar.numeroDocumento=cliente.getNumeroDocumento();
        }else{
            throw new WebApplicationException("Cliente deshabilitado");
        }

        return actualizar;

    }
}
