package com.bc.semana1.service;

import com.bc.semana1.entity.Operacion;

import java.util.List;

public interface OperacionService {

    public Operacion insertarOperacion(Operacion operacion);
    public List<Operacion> listarOperaciones();
    public Operacion actualizarOperacion(Operacion operacion);

    public void eliminarOperacion(Long operacionId);

}
