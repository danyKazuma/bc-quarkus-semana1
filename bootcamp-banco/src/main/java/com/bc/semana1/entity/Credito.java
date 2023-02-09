package com.bc.semana1.entity;

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
public class Credito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate fechaVencimiento;
    private double limiteCredito;
    private Integer cuotas;
    private LocalDate fechaPagoInicial;
    private double saldoInicial;
    private double saldoActual;
    private LocalDate fechaPagoMensual;
    private boolean estado;
}
