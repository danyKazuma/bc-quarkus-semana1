package com.bc.semana1.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name="credito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Credito")
public class Credito extends PanacheEntity {

    private LocalDate fechaVencimiento;
    private double limiteCredito;
    private Integer cuotas;
    private LocalDate fechaPagoInicial;
    private double saldoInicial;
    private double saldoActual;
    private LocalDate fechaPagoMensual;
    private boolean estado;
}
