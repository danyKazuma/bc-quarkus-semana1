package com.bc.semana1;

import com.bc.semana1.entity.TarjetaDebito;
import com.bc.semana1.resource.TarjetaDebitoResource;
import com.bc.semana1.service.TarjetaDebitoService;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class TarjetaDebitoResourceTest {

    @Inject
    TarjetaDebitoResource tarjetaDebitoResource;

    @InjectMock
    TarjetaDebitoService tarjetaDebitoService;

    @Test
    void registrarTarjetaDebito() {
        Mockito.when(tarjetaDebitoService.registrarTarjetaDebito(Mockito.any())).thenReturn(new TarjetaDebito());
        TarjetaDebito tarjetaDebito = tarjetaDebitoResource.registrarTarjetaDebito(Mockito.any());
        Assertions.assertEquals(new TarjetaDebito(), tarjetaDebito);
    }

    @Test
    void actualizarTarjetaDebito() {
        Mockito.when(tarjetaDebitoService.actualizarTarjetaDebito(Mockito.any())).thenReturn(new TarjetaDebito());
        TarjetaDebito tarjetaDebito = tarjetaDebitoResource.actualizarTarjetaDebito(Mockito.any());
        Assertions.assertEquals(new TarjetaDebito(), tarjetaDebito);
    }

    @Test
    void listarTarjetaDebitoPorCliente() {
        ArrayList<TarjetaDebito> lista = new ArrayList<>();
        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        lista.add(tarjetaDebito);
        Mockito.when(tarjetaDebitoService.listarTarjetaDebito(Mockito.any())).thenReturn(lista);
        List<TarjetaDebito> listaResultado = tarjetaDebitoResource.listarTarjetaDebitoPorCliente(Mockito.any());
        Assertions.assertEquals(lista, listaResultado);
    }
}