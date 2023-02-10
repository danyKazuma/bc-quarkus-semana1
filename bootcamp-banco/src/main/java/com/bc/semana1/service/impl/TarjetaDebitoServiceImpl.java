package com.bc.semana1.service.impl;

import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.entity.TarjetaDebito;
import com.bc.semana1.repository.TarjetaDebitoRepository;
import com.bc.semana1.service.CtaBancariaService;
import com.bc.semana1.service.TarjetaDebitoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@ApplicationScoped
public class TarjetaDebitoServiceImpl implements TarjetaDebitoService {

    @Inject
    TarjetaDebitoRepository repository;

    @Inject
    CtaBancariaService ctaBancariaService;


    @Override
    @Transactional
    public String registrarTarjetaDebito(TarjetaDebito tarjetaDebito) {

        CtaBancaria cuentaPrincipal = ctaBancariaService.buscarCtaBancaria(tarjetaDebito.getCuentaPrincipal());

        if(cuentaPrincipal!=null && cuentaPrincipal.isEstado()){
            if(tarjetaDebito.getCuentaSecundaria()!=null) {
                CtaBancaria cuentaSecundaria = ctaBancariaService.buscarCtaBancaria(tarjetaDebito.getCuentaSecundaria());
                if(cuentaSecundaria==null){
                    return "Cta Secundaria no encontrada";
                }
            }
            Random r = new Random();
            int cantidad = r.nextInt(900000000) + 10000;
            String randomValue = "1006090"+cantidad;

            tarjetaDebito.setNumeroTarjeta(randomValue);
            tarjetaDebito.setEstado(true);
            repository.persist(tarjetaDebito);
            return "Registro de tarjeta debito satisfactorio";
        }

        return "Cta no encontrada";
    }

    @Override
    @Transactional
    public String actualizarTarjetaDebito(TarjetaDebito tarjetaDebito) {
        repository.persistAndFlush(tarjetaDebito);
        return "Tarjeta de Debito actualizada";
    }

    @Override
    public List<TarjetaDebito> listarTarjetaDebito(String documentoIdentidad) {
        List<CtaBancaria> ctaBancarias = ctaBancariaService.listarCtaBancariaCliente(documentoIdentidad);

        return ctaBancarias.stream().map(cta->{
            return repository.buscarTarjetaDebitoPorCtaPrincipal(cta.getCuentaBancaria());
        }).collect(Collectors.toList());
    }

    @Override
    public String eliminarTarjetaDebito(String documentoIdentidad, String numTarjetaDebito) {
        return null;
    }
}
