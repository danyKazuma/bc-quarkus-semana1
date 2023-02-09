package com.bc.semana1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="ctaBancaria")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CtaBancaria")
public class CtaBancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cliente;
    private String cuentaBancaria;
    private double saldoActual;
    private boolean estado;

}
