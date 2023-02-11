package com.bc.semana1.service.impl;

import com.bc.semana1.entity.Cliente;
import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.service.ClienteService;
import com.bc.semana1.service.CtaBancariaService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

import java.util.List;

@ApplicationScoped
public class CtaBancariaServiceImpl implements CtaBancariaService {

    @Inject
    ClienteService clienteService;

    @Override
    @Transactional
    public CtaBancaria registrarCtaBancaria(CtaBancaria ctaBancaria) {

        Cliente clienteRegistrado = clienteService.buscarClientePorDocumento(ctaBancaria.getCliente());

        if(clienteRegistrado.isEstado()){
            CtaBancaria.persist(ctaBancaria);
            return ctaBancaria;
        }
        throw new WebApplicationException(Response.Status.NO_CONTENT);
    }

    @Override
    @Transactional
    public CtaBancaria actualizarCtaBancaria(CtaBancaria ctaBancaria) {
        try{
            CtaBancaria cta=CtaBancaria.findById(ctaBancaria.id);
            cta.setCuentaBancaria(cta.getCuentaBancaria());
            cta.setSaldoActual(ctaBancaria.getSaldoActual());
            CtaBancaria.persist(cta);
            return cta;
        }catch (Exception ex){
            throw new WebApplicationException(Response.Status.BAD_REQUEST);
        }
    }

    @Override
    public List<CtaBancaria> listarCtaBancariaCliente(String numDocumentoCliente) {
        return CtaBancaria.list("cliente",numDocumentoCliente);
    }

    @Override
    public CtaBancaria buscarCtaBancaria(String numCtaBancaria) {
        return CtaBancaria.find("cuentaBancaria",numCtaBancaria).firstResult();
    }

    @Override
    @Transactional
    public void eliminarCtaBancaria(CtaBancaria ctaBancaria) {
        CtaBancaria cta = CtaBancaria.findById(ctaBancaria.id);
        cta.setEstado(false);
        CtaBancaria.persist(cta);
    }

}
