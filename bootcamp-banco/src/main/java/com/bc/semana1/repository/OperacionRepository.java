package com.bc.semana1.repository;

import com.bc.semana1.entity.Operacion;
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface OperacionRepository extends PanacheRepository<Operacion> {
}
