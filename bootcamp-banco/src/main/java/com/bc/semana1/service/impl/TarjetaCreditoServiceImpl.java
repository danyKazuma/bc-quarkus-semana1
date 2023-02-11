package com.bc.semana1.service.impl;

import com.bc.semana1.entity.TarjetaCredito;
import com.bc.semana1.service.TarjetaCreditoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Random;

@ApplicationScoped
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService {

    @Override
    public TarjetaCredito consultaSaldoTarjetaCredito(String numeroTarjetaCredito) {
        TarjetaCredito tarjetaCredito = TarjetaCredito.find("numeroTarjeta=?1 and estado=true",numeroTarjetaCredito).firstResult();
        return tarjetaCredito;
    }

    @Override
    public List<TarjetaCredito> consultaCliente(String numDocumentoCliente) {
        return TarjetaCredito.list("cliente=?1 and estado=true", numDocumentoCliente);
    }

    @Override
    @Transactional
    public TarjetaCredito registrarTarjetaCredito(TarjetaCredito tarjetaCredito) {

        Random r = new Random();
        int cantidad = r.nextInt(900000000) + 10000;
        String randomValue = "7856777"+cantidad;

        tarjetaCredito.setNumeroTarjeta(randomValue);
        tarjetaCredito.setEstado(true);
        TarjetaCredito.persist(tarjetaCredito);
        return tarjetaCredito;
    }

    @Override
    @Transactional
    public void eliminarTarjetaCredito(String numeroTarjetaCredito) {
        TarjetaCredito tarjetaCredito = TarjetaCredito.find("numeroTarjeta",numeroTarjetaCredito).firstResult();
        tarjetaCredito.setEstado(false);
        TarjetaCredito.persist(tarjetaCredito);
    }
}
