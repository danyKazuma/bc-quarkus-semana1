package com.bc.semana1.entity;


import jakarta.persistence.*;
import lombok.*;
@Entity(name="cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Cliente")
public class Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String nombre;
    public String apellidoM;
    public String apellidoP;
    public String tipoDocumento;
    public String numeroDocumento;
    public String fechaDeNacimiento; //limite a partir de los 18 años
    public boolean estado; //en caso de penalizacion de credito, desactivar cuenta

}
