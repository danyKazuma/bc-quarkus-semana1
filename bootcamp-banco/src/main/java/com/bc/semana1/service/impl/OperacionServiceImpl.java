package com.bc.semana1.service.impl;

import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.entity.Operacion;
import com.bc.semana1.service.CtaBancariaService;
import com.bc.semana1.service.OperacionService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class OperacionServiceImpl implements OperacionService {

    @Inject
    CtaBancariaService ctaBancariaService;

    @Override
    @Transactional
    public Operacion insertarOperacion(Operacion operacion) {

        CtaBancaria cta = ctaBancariaService.buscarCtaBancaria(operacion.getNumeroCuenta());
        if(cta.isEstado()) {

            double valorResultado = operacion.getMonto() + cta.getSaldoActual();

            if (valorResultado < 0) {
                throw new WebApplicationException(Response.Status.BAD_REQUEST);
            }
            operacion.setFecha(LocalDateTime.now());
            operacion.setEstado(true);
            Operacion.persist(operacion);
            cta.setSaldoActual(valorResultado);
            ctaBancariaService.actualizarCtaBancaria(cta);
            return operacion;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @Override
    public List<Operacion> listarOperaciones() {
        return Operacion.list("estado",true);
    }

    @Override
    @Transactional
    public Operacion actualizarOperacion(Operacion operacion) {
        Operacion ope  = Operacion.findById(operacion.id);
        ope.setNumeroCuenta(operacion.getNumeroCuenta());
        Operacion.persist(ope);
        return ope;
    }

    @Override
    public void eliminarOperacion(Long operacionId) {
        Operacion ope  = Operacion.findById(operacionId);
        ope.setEstado(false);
        Operacion.persist(ope);
    }


}
