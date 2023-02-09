package com.bc.semana1.service;

import com.bc.semana1.entity.TarjetaCredito;
public interface TarjetaCreditoService {

    String consultaSaldo(TarjetaCredito tarjetaCredito);
    String consultaCliente(TarjetaCredito tarjetaCredito);
    String registrarTarjetaCredito(TarjetaCredito tarjetaCredito);
    boolean estadoTarjetaCredito(TarjetaCredito tarjetaCredito);
}
