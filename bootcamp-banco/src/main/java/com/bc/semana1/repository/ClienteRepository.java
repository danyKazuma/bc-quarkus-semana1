package com.bc.semana1.repository;

import com.bc.semana1.entity.Cliente;
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository;

public interface ClienteRepository extends PanacheRepository<Cliente> {


}