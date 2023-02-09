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
    @Column(name = "Id")
    private Long lId;
    @Column(name = "NumeroTarjeta")
    private String sNumeroTarjeta;
    @Column(name = "PIN")
    private String sPin;
    @Column(name = "CVV")
    private String sCvv;
    @Column(name = "FechaCorte")
    private LocalDateTime ldtFechaCorte;
    @Column(name = "FechaVencimiento")
    private LocalDateTime ldtFechaVencimiento;
    @Column(name = "SaldoActual")
    private double dSaldoActual;
    @Column(name = "LimiteCredito")
    private double dLimiteCredito;
    @Column(name = "Estado")
    private boolean bEstado;
}
