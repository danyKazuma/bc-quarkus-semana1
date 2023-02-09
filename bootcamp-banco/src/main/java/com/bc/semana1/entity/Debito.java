package com.bc.semana1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="debito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Debito")
public class Debito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long lId;
    @Column(name = "SaldoActual")
    private Long lSaldoActual;
    @Column(name = "CuentaPrincipal")
    private String sCuentaPrincipal;
    @Column(name = "CuentaSecundaria")
    private String sCuentaSecundaria;
    @Column(name = "Estado")
    private boolean bEstado;
}
