package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
public class puesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPuesto;

    private String nombre;
    private String tipoPuesto;
    private double salario;
}

