package com.bc.semana1.service.impl;

import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.repository.CtaBancariaRepository;
import com.bc.semana1.service.CtaBancariaService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class CtaBancariaServiceImpl implements CtaBancariaService {

    @Inject
    CtaBancariaRepository repository;

    @Override
    public String registrarCtaBancaria(CtaBancaria ctaBancaria) {
        return null;
    }

    @Override
    public String actualizarCtaBancaria(CtaBancaria ctaBancaria) {
        return null;
    }

    @Override
    public List<CtaBancaria> listarCtaBancariaCliente(String numDocumentoCliente) {
        return null;
    }

    @Override
    public CtaBancaria buscarCtaBancaria(String numCtaBancaria) {
        return null;
    }
}
