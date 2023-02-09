package com.bc.semana1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity(name="tarjetaCredito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TarjetaCredito")
public class TarjetaCredito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numeroTarjeta;
    private String pin;
    private String cvv;
    private LocalDateTime fechaCorte;
    private LocalDateTime fechaVencimiento;
    private double saldoActual;
    private double limiteCredito;
    private boolean estado;
}
