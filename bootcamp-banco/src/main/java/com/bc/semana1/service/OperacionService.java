package com.bc.semana1.service;

import com.bc.semana1.entity.Operacion;

import java.util.List;

public interface OperacionService {

    public String insertarOperacion(Operacion operacion);
    public List<Operacion> listarOperaciones();
    public String actualizarOperacion(Operacion operacion);

}
