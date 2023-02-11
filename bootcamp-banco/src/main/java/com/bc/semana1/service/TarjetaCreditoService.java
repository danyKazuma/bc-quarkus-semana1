package com.bc.semana1.service;

import com.bc.semana1.entity.TarjetaCredito;

import java.util.List;

public interface TarjetaCreditoService {

    TarjetaCredito consultaSaldoTarjetaCredito(String numeroTarjetaCredito);
    List<TarjetaCredito> consultaCliente(String numDocumentoCliente);
    TarjetaCredito registrarTarjetaCredito(TarjetaCredito tarjetaCredito);
    void eliminarTarjetaCredito(String numeroTarjetaCredito);
}
