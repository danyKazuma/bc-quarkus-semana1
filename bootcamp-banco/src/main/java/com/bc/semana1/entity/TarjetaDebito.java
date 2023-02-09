package com.bc.semana1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Entity(name="tarjetaDebito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TarjetaDebito")
public class TarjetaDebito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long lId;
    @Column(name = "SaldoActual")
    private double dSaldoActual;
    @Column(name = "CuentaPrincipal")
    private String sCuentaPrincipal;
    @Column(name = "CuentaSecundaria")
    private String sCuentaSecundaria;
    @Column(name = "FechaVencimiento")
    private LocalDate ldtFechaVencimiento;
    @Column(name = "PIN")
    private String sPin;
    @Column(name = "CVV")
    private String sCvv;
    @Column(name = "Estado")
    private boolean bEstado;
}
