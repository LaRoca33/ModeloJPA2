package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter @Setter
public class proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProyecto;

    private String nombre;

    @OneToMany(mappedBy = "proyecto")
    private List<proyectoEmpleado> empleados;
}
