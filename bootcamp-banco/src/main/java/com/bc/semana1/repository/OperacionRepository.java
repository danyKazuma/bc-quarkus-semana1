package com.bc.semana1.repository;

import com.bc.semana1.entity.Operacion;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class OperacionRepository implements PanacheRepository<Operacion> {

}
