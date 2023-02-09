package com.bc.semana1.service;

import com.bc.semana1.entity.TarjetaDebito;

import java.util.List;

public interface TarjetaDebitoService {

    public String registrarTarjetaDebito(TarjetaDebito tarjetaDebito);

    public String actualizarTarjetaDebito(TarjetaDebito tarjetaDebito);

    public List<TarjetaDebito> listarTarjetaDebito(String documentoIdentidad);

    public String eliminarTarjetaDebito(String documentoIdentidad, String numTarjetaDebito);

}