package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
public class lineaNomina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLineaNomina;

    private String concepto;
    private double cantidad;

    @ManyToOne
    @JoinColumn(name = "idNomina", nullable = false)
    private nomina nomina;
}
