package com.bc.semana1.service.impl;

import com.bc.semana1.entity.TarjetaDebito;
import com.bc.semana1.repository.TarjetaDebitoRepository;
import com.bc.semana1.service.TarjetaDebitoService;
import jakarta.inject.Inject;

import java.util.List;

public class TarjetaDebitoServiceImpl implements TarjetaDebitoService {

    @Inject
    TarjetaDebitoRepository repository;

    @Override
    public String registrarTarjetaDebito(TarjetaDebito tarjetaDebito) {
        return null;
    }

    @Override
    public String actualizarTarjetaDebito(TarjetaDebito tarjetaDebito) {
        return null;
    }

    @Override
    public List<TarjetaDebito> listarTarjetaDebito(String documentoIdentidad) {
        return null;
    }

    @Override
    public String eliminarTarjetaDebito(String documentoIdentidad, String numTarjetaDebito) {
        return null;
    }
}
