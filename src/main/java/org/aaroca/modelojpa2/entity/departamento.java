package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter @Setter
public class departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartamento;

    private String nombre;
    private double presupuesto;

    @OneToMany(mappedBy = "departamento")
    private List<empleado> empleados;
}

