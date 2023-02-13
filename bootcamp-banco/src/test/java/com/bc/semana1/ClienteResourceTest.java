package com.bc.semana1;

import com.bc.semana1.entity.Cliente;
import com.bc.semana1.resource.ClienteResource;
import com.bc.semana1.service.ClienteService;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

@QuarkusTest
class ClienteResourceTest {

    @Inject
    ClienteResource clienteResource;

    @InjectMock
    ClienteService clienteService;

    @Test
    void listarCliente() {
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente.add(new Cliente());
        Mockito.when(clienteService.listarCliente()).thenReturn(listaCliente);

        List<Cliente> resultado = clienteResource.listarCliente();
        Assertions.assertEquals(resultado,listaCliente);
    }

    @Test
    void registrarCliente() {
        Mockito.when(clienteService.insertarCliente(Mockito.any())).thenReturn(new Cliente());
        Assertions.assertEquals(new Cliente(),clienteResource.registrarCliente(Mockito.any()));
    }

    @Test
    void actualizarCliente() {
        Mockito.when(clienteService.actualizarCliente(Mockito.any())).thenReturn(new Cliente());
        Assertions.assertEquals(new Cliente(),clienteResource.actualizarCliente(Mockito.any()));
    }

    @Test
    void borrarCliente() {
        clienteResource.borrarCliente("1");
        Mockito.verify(clienteService,Mockito.times(1)).borrarCliente(Mockito.anyLong());
    }
}