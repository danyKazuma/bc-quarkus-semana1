package com.bc.semana1.service.impl;

import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.entity.TarjetaDebito;
import com.bc.semana1.service.CtaBancariaService;
import com.bc.semana1.service.TarjetaDebitoService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@ApplicationScoped
public class TarjetaDebitoServiceImpl implements TarjetaDebitoService {

    @Inject
    CtaBancariaService ctaBancariaService;


    @Override
    @Transactional
    public TarjetaDebito registrarTarjetaDebito(TarjetaDebito tarjetaDebito) {
        try{
            CtaBancaria cuentaPrincipal = ctaBancariaService.buscarCtaBancaria(tarjetaDebito.getCuentaPrincipal());
            if(cuentaPrincipal.isEstado()){
                if(tarjetaDebito.getCuentaSecundaria()!=null) {
                    CtaBancaria cuentaSecundaria = ctaBancariaService.buscarCtaBancaria(tarjetaDebito.getCuentaSecundaria());
                    if(cuentaSecundaria==null){
                        throw new WebApplicationException(Response.Status.NO_CONTENT);
                    }
                }
                Random r = new Random();
                int cantidad = r.nextInt(900000000) + 10000;
                String randomValue = "1006090"+cantidad;

                tarjetaDebito.setNumeroTarjeta(randomValue);
                tarjetaDebito.setEstado(true);
                TarjetaDebito.persist(tarjetaDebito);
            }
            return tarjetaDebito;

        }catch (Exception ex){
            throw new WebApplicationException(Response.Status.NO_CONTENT);
        }
    }

    @Override
    @Transactional
    public TarjetaDebito actualizarTarjetaDebito(TarjetaDebito tarjetaDebito) {
        try{
            TarjetaDebito tdb = TarjetaDebito.findById(tarjetaDebito.id);
            tdb.setCuentaPrincipal(tarjetaDebito.getCuentaPrincipal());
            tdb.setCuentaSecundaria(tarjetaDebito.getCuentaSecundaria());
            tdb.setSaldoActual(tarjetaDebito.getSaldoActual());
            TarjetaDebito.persist(tdb);
            return tdb;
        }catch (Exception ex){
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }
    }

    @Override
    public List<TarjetaDebito> listarTarjetaDebito(String documentoIdentidad) {
        List<CtaBancaria> ctaBancarias = ctaBancariaService.listarCtaBancariaCliente(documentoIdentidad);

        return ctaBancarias.stream().map(cta->{
            return (TarjetaDebito)TarjetaDebito.find("cuentaPrincipal",cta.getCuentaBancaria()).firstResult();
        }).collect(Collectors.toList());
    }

    @Override
    public void eliminarTarjetaDebito(TarjetaDebito tarjetaDebito) {
        TarjetaDebito tdb = TarjetaDebito.findById(tarjetaDebito.id);
        tdb.setEstado(false);
        TarjetaDebito.persist(tdb);
    }
}
