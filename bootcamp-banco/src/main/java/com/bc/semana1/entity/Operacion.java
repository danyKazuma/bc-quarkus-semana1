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
public class Operacion{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime fecha;
    private String descripcion;
    private double monto;
    private String numeroCuenta;
    private boolean estado;
}
