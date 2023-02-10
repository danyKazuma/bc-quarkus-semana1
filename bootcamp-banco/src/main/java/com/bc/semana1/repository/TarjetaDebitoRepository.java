package com.bc.semana1.repository;

import com.bc.semana1.entity.TarjetaDebito;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TarjetaDebitoRepository implements PanacheRepository<TarjetaDebito> {

    public TarjetaDebito buscarTarjetaDebitoPorCtaPrincipal(String ctaPrincipal){
        return find("cuentaPrincipal",ctaPrincipal).firstResult();
    }

}
