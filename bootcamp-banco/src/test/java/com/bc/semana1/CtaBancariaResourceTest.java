package com.bc.semana1;

import com.bc.semana1.entity.CtaBancaria;
import com.bc.semana1.resource.CtaBancariaResource;
import com.bc.semana1.service.CtaBancariaService;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


@QuarkusTest
class CtaBancariaResourceTest {

    @Inject
    CtaBancariaResource ctaBancariaResource;

    @InjectMock
    CtaBancariaService ctaBancariaService;

    @Test
    void registrarCtaBancaria() {
        Mockito.when(ctaBancariaService.registrarCtaBancaria(Mockito.any())).thenReturn(new CtaBancaria());
        CtaBancaria ctaBancaria = ctaBancariaResource.registrarCtaBancaria(Mockito.any());
        Assertions.assertEquals(new CtaBancaria(),ctaBancaria);
    }

    @Test
    void buscarCtaBancariaCliente() {
        ArrayList<CtaBancaria> listaCtaBancaria = new ArrayList<>();
        CtaBancaria cta = new CtaBancaria();
        listaCtaBancaria.add(cta);
        Mockito.when(ctaBancariaService.listarCtaBancariaCliente(Mockito.anyString())).thenReturn(listaCtaBancaria);
        List<CtaBancaria> listaResultado = ctaBancariaResource.buscarCtaBancariaCliente(Mockito.anyString());
        Assertions.assertEquals(listaCtaBancaria, listaResultado);
    }

    @Test
    void buscarCtaBancaria() {
        Mockito.when(ctaBancariaService.buscarCtaBancaria(Mockito.anyString())).thenReturn(new CtaBancaria());
        CtaBancaria ctaBancaria = ctaBancariaResource.buscarCtaBancaria(Mockito.anyString());
        Assertions.assertEquals(new CtaBancaria(),ctaBancaria);
    }

    @Test
    void actualizarCtaBancaria() {
        Mockito.when(ctaBancariaService.actualizarCtaBancaria(Mockito.any())).thenReturn(new CtaBancaria());
        CtaBancaria ctaBancaria = ctaBancariaResource.actualizarCtaBancaria(Mockito.any());
        Assertions.assertEquals(new CtaBancaria(),ctaBancaria);
    }

    @Test
    void eliminarCtaBancaria() {
        ctaBancariaResource.eliminarCtaBancaria(Mockito.anyString());
        Mockito.verify(ctaBancariaService,Mockito.times(1)).eliminarCtaBancaria(Mockito.any());
    }
}