package com.bc.semana1;

import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.entity.Operacion;
import com.bc.semana1.resource.OperacionResource;
import com.bc.semana1.service.CtaBancariaService;
import com.bc.semana1.service.OperacionService;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import jakarta.inject.Inject;
import jakarta.ws.rs.WebApplicationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


@QuarkusTest
class OperacionResourceTest {

    @Inject
    OperacionResource operacionResource;

    @InjectMock
    OperacionService operacionService;

    @InjectMock
    CtaBancariaService ctaBancariaService;

    @Test
    void listarOperaciones() {
    }

    @Test
    void registrarOperacion() {
        Mockito.when(ctaBancariaService.buscarCtaBancaria(Mockito.anyString())).thenReturn(new CtaBancaria());
        Mockito.when(operacionService.insertarOperacion(Mockito.any())).thenThrow(WebApplicationException.class);

        Assertions.assertThrows(WebApplicationException.class,()->{
            operacionResource.registrarOperacion(new Operacion());
        });
    }

    @Test
    void actualizarOperacion() {
    }

    @Test
    void deshabilitarOperacion() {
    }
}