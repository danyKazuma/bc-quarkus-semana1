package com.bc.semana1.service;

import com.bc.semana1.entity.CtaBancaria;

import java.util.List;

public interface CtaBancariaService {

    public CtaBancaria registrarCtaBancaria(CtaBancaria ctaBancaria);

    public CtaBancaria actualizarCtaBancaria(CtaBancaria ctaBancaria);

    public List<CtaBancaria> listarCtaBancariaCliente(String numDocumentoCliente);

    public CtaBancaria buscarCtaBancaria(String numCtaBancaria);

    public void eliminarCtaBancaria(CtaBancaria ctaBancaria);

}
