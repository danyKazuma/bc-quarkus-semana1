package com.bc.semana1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="debito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Debito")
public class Debito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long saldoActual;
    private String cuentaPrincipal;
    private String cuentaSecundaria;
    private boolean estado;
}
