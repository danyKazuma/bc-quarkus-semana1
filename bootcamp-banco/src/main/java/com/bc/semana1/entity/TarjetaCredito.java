package com.bc.semana1.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name="tarjetaCredito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TarjetaCredito")
public class TarjetaCredito extends PanacheEntity {

    private String numeroTarjeta;
    private String pin;
    private String cvv;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fechaCorte;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fechaVencimiento;
    private double saldoActual;
    private double limiteCredito;
    private boolean estado;
    private String cliente;
}
