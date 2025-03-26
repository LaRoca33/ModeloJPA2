package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter @Setter
public class nomina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNomina;

    private int mes;
    private int anio;

    @ManyToOne
    @JoinColumn(name = "idEmpleado", nullable = false)
    private Empleado empleado;

    @OneToMany(mappedBy = "nomina")
    private List<LineaNomina> lineasNomina;
}

