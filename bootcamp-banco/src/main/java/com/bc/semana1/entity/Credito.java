package com.bc.semana1.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name="credito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Credito")
public class Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long lId;
    @Column(name = "FechaVencimiento")
    private LocalDate ldtFechaVencimiento;
    @Column(name = "LimiteCredito")
    private double dLimiteCredito;
    @Column(name = "Cuotas")
    private Integer iCuotas;
    @Column(name = "FechaPagoInicial")
    private LocalDate ldtFechaPagoInicial;
    @Column(name = "SaldoInicial")
    private double lSaldoInicial;
    @Column(name = "SaldoActual")
    private double lSaldoActual;
    @Column(name = "FechaPagoMensual")
    private LocalDate ldtFechaPagoMensual;
    @Column(name = "Estado")
    private boolean bEstado;
}
