package com.bc.semana1.service;

import com.bc.semana1.entity.TarjetaDebito;

import java.util.List;

public interface TarjetaDebitoService {

    public TarjetaDebito registrarTarjetaDebito(TarjetaDebito tarjetaDebito);

    public TarjetaDebito actualizarTarjetaDebito(TarjetaDebito tarjetaDebito);

    public List<TarjetaDebito> listarTarjetaDebito(String documentoIdentidad);

    public void eliminarTarjetaDebito(TarjetaDebito tarjetaDebito);

}