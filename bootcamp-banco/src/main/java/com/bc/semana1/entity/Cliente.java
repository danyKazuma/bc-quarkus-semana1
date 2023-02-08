package com.bc.semana1.entity;


import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity;
import jakarta.persistence.*;
import lombok.*;
@Entity(name="cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Cliente")
public class Cliente extends PanacheEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    public Long lId;
    @Column(name="Nombre")
    public String sNombre;
    @Column(name="ApellidoM")
    public String sApellidoM;
    @Column(name="ApellidoP")
    public String sApellidoP;
    @Column(name="TipoDocumento")
    public String sTipoDocumento;
    @Column(name="NumeroDocumento")
    public String sNumeroDocumento;
    @Column(name="RUC")
    public String sRuc;
    @Column(name="FechaDeNacimiento")
    public String sFechaDeNacimiento; //limite a partir de los 18 años
    @Column(name="Estado")
    public String sEstado; //en caso de penalizacion de credito, desactivar cuenta

}
