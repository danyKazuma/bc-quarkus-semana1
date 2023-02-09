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
    @Column(name = "Id")
    private Long lId;
    @Column(name = "Cliente")
    private String sCliente;
    @Column(name = "CuentaBancaria")
    private String sCuentaBancaria;
    @Column(name = "SaldoActual")
    private Long lSaldoActual;
    @Column(name = "Estado")
    private boolean bEstado;

}
