package com.bc.semana1.service.impl;

import com.bc.semana1.entity.TarjetaCredito;
import com.bc.semana1.repository.TarjetaCreditoRepository;
import com.bc.semana1.service.TarjetaCreditoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService {

    @Inject
    TarjetaCreditoRepository tarjetaCreditoRepository;
    @Transactional
    public String registrarTarjetaCredito(TarjetaCredito tarjetaCredito){
        tarjetaCreditoRepository.persist(tarjetaCredito);
        return "Registro satisfactorio";
    }

    @Override
    public boolean estadoTarjetaCredito(TarjetaCredito tarjetaCredito) {
        return false;
    }

    @Transactional
    public String consultaCliente(TarjetaCredito tarjetaCredito){
        tarjetaCreditoRepository.findById(tarjetaCredito.getId());
        return "Registro encontrado";
    }

    @Transactional
    public String consultaSaldo(TarjetaCredito tarjetaCredito){
        tarjetaCreditoRepository.findById((long) tarjetaCredito.getSaldoActual());
        return tarjetaCreditoRepository.listAll().toString();

    }

}
