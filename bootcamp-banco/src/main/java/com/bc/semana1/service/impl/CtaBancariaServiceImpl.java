package com.bc.semana1.service.impl;

import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.repository.CtaBancariaRepository;
import com.bc.semana1.service.ClienteService;
import com.bc.semana1.service.CtaBancariaService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
//import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@ApplicationScoped
public class CtaBancariaServiceImpl implements CtaBancariaService {

    @Inject
    CtaBancariaRepository repository;

//    @Inject
//    @RestClient
//    ClienteService clienteService;

    @Override
    @Transactional
    public String registrarCtaBancaria(CtaBancaria ctaBancaria) {

//        boolean clienteRegistrado = clienteService.buscarClientePorDocumento(ctaBancaria.getCliente());
        boolean clienteRegistrado = true;

        if(clienteRegistrado){
            repository.persist(ctaBancaria);
            return "Registro de CtaBancaria Satisfactorio";
        }

        return "Cliente no encontrado";
    }

    @Override
    @Transactional
    public String actualizarCtaBancaria(CtaBancaria ctaBancaria) {
        repository.persistAndFlush(ctaBancaria);
        return "Actualizacion realizada";
    }

    @Override
    public List<CtaBancaria> listarCtaBancariaCliente(String numDocumentoCliente) {
        return repository.findByCliente(numDocumentoCliente);
    }

    @Override
    public CtaBancaria buscarCtaBancaria(String numCtaBancaria) {
        return repository.findByNumCtaBancaria(numCtaBancaria);
    }

    @Override
    @Transactional
    public String eliminarCtaBancaria(CtaBancaria ctaBancaria) {
        ctaBancaria.setEstado(false);
        repository.persistAndFlush(ctaBancaria);
        return "Cta bancaria eliminada";
    }

}
