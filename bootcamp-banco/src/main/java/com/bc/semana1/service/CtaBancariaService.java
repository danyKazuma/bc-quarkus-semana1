package com.bc.semana1.service;

import com.bc.semana1.entity.CtaBancaria;

import java.util.List;

public interface CtaBancariaService {

    public String registrarCtaBancaria(CtaBancaria ctaBancaria);

    public String actualizarCtaBancaria(CtaBancaria ctaBancaria);

    public List<CtaBancaria> listarCtaBancariaCliente(String numDocumentoCliente);

    public CtaBancaria buscarCtaBancaria(String numCtaBancaria);

}
