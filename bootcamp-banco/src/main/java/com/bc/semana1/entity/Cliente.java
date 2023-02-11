package com.bc.semana1.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name="cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Cliente")
public class Cliente extends PanacheEntity {

    public String nombre;
    public String apellidoM;
    public String apellidoP;
    public String tipoDocumento;
    public String numeroDocumento;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    public LocalDate fechaDeNacimiento;
    public boolean estado;

}
