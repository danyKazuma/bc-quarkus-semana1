package com.bc.semana1.repository;

import com.bc.semana1.entity.CtaBancaria;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class CtaBancariaRepository implements PanacheRepository<CtaBancaria> {

    public List<CtaBancaria> findByCliente(String numDocumentoCliente){
        return list("cliente", numDocumentoCliente);
    }

    public CtaBancaria findByNumCtaBancaria(String numCtaBancaria){
        return find("cuentabancaria",numCtaBancaria).firstResult();
    }

}
