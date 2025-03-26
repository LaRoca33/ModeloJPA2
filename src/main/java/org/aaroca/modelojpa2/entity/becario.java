package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class becario extends persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "empleado_idEmpleado", unique = true)
    private empleado empleado;
    private int horasTrabajo;
    private String universidad;
}

