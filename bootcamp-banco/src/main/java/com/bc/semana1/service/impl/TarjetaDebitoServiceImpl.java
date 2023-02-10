package com.bc.semana1.service.impl;

import com.bc.semana1.entity.TarjetaDebito;
import com.bc.semana1.repository.TarjetaDebitoRepository;
import com.bc.semana1.service.TarjetaDebitoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class TarjetaDebitoServiceImpl implements TarjetaDebitoService {

    @Inject
    TarjetaDebitoRepository repository;

    @Override
    public String registrarTarjetaDebito(TarjetaDebito tarjetaDebito) {

//        boolean cuentaRegistrada = ctaBancariaService.buscarCtaBancaria(tarjetaDebito.getCuentaPrincipal());
        boolean cuentaRegistrada = true;

        if(cuentaRegistrada){
            repository.persist(tarjetaDebito);
            return "Registro de tarjeta debito satisfactorio";
        }

        return "Cta no encontrada";
    }

    @Override
    public String actualizarTarjetaDebito(TarjetaDebito tarjetaDebito) {
        repository.persistAndFlush(tarjetaDebito);
        return "Tarjeta de Debito aactualizada";
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
