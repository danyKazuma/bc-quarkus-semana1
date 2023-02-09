package com.bc.semana1.service.impl;

import com.bc.semana1.entity.TarjetaCredito;
import com.bc.semana1.repository.TarjetaCreditoRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

public class TarjetaCreditoServiceImpl {

    @Inject
    TarjetaCreditoRepository tarjetaCreditoRepository;
    @Transactional
    public String registrarTarjetaCredito(TarjetaCredito tarjetaCredito){
        tarjetaCreditoRepository.persist(tarjetaCredito);
        return "Registro satisfactorio";
    }

    @Transactional
    public String consultaCliente(TarjetaCredito tarjetaCredito){
        tarjetaCreditoRepository.findById(tarjetaCredito.getId());
        return "Registro encontrado";
    }

    @Transactional
    public List<TarjetaCredito> consultaSaldo(TarjetaCredito tarjetaCredito){
        tarjetaCreditoRepository.findById((long) tarjetaCredito.getSaldoActual());
        return tarjetaCreditoRepository.listAll();

    }

}
