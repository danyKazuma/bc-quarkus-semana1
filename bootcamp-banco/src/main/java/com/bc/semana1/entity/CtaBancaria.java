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
//    @Column(name = "Id")
    private Long id;
//    @Column(name = "Cliente")
    private String cliente;
//    @Column(name = "CuentaBancaria")
    private String cuentaBancaria;
//    @Column(name = "SaldoActual")
    private double saldoActual;
//    @Column(name = "Estado")
    private boolean estado;

}
