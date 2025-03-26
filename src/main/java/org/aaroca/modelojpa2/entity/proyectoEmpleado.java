package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Getter @Setter
public class proyectoEmpleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idProyecto", nullable = false)
    private proyecto proyecto;

    @ManyToOne
    @JoinColumn(name = "idEmpleado", nullable = false)
    private empleado empleado;

    private Date fechaInicio;
}

