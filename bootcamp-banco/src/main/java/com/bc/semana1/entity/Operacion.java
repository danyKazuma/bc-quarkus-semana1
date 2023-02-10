package com.bc.semana1.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
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
public class Operacion extends PanacheEntity {

////    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
    private LocalDateTime fecha;
    private String descripcion;
    private double monto;
    private String numeroCuenta;
    private boolean estado;


}
