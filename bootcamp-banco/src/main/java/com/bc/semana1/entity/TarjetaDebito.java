package com.bc.semana1.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity(name="tarjetaDebito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TarjetaDebito")
public class TarjetaDebito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numeroTarjeta;
    private double saldoActual;
    private String cuentaPrincipal;
    private String cuentaSecundaria;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate fechaVencimiento;
    private String pin;
    private String cvv;
    private boolean estado;
}
