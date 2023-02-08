package com.bc.semana1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "operacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Operacion")
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long lId;

    @Column(name = "Fecha")
    private LocalDateTime ldtFecha;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Monto")
    private double dMonto;

    @Column(name = "NumeroCuenta")
    private String sNumeroCuenta;

}