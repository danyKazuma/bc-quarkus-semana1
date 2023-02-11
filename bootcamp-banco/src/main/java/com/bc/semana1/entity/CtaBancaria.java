package com.bc.semana1.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="ctaBancaria")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CtaBancaria")
public class CtaBancaria extends PanacheEntity {

    private String cliente;
    private String cuentaBancaria;
    private double saldoActual;
    private boolean estado;

}
