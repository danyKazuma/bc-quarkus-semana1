package com.bc.semana1.service.impl;

import com.bc.semana1.entity.Operacion;
import com.bc.semana1.repository.OperacionRepository;
import com.bc.semana1.service.OperacionService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@ApplicationScoped
public class OperacionServiceImpl implements OperacionService {

    @Inject
    OperacionRepository repository;

    @Override
    @Transactional
    public String insertarOperacion(Operacion operacion) {

        //obtener cta bancaria actual REST
        double saldoActual = 100;
        if(operacion.getMonto()+saldoActual<0){
            return "No tiene saldo suficiente para la operacion";
        }
        operacion.setFecha(LocalDateTime.now());
        operacion.setEstado(true);
        repository.persist(operacion);

        return "Registro Satisfactorio";
    }

    @Override
    public List<Operacion> listarOperaciones() {
        return repository.listAll();
    }

    @Override
    @Transactional
    public String actualizarOperacion(Operacion operacion) {
        Operacion findOperacion = repository.findById(operacion.getId());

        if(findOperacion!=null){
            repository.persistAndFlush(operacion);
        }else{
            return "Operacion no encontrada";
        }
        return "Operacion actualizada";
    }
}
