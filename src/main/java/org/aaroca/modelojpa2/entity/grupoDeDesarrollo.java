package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class grupoDeDesarrollo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGrupoDeDesarrollo;

    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "grupo_empleado",
            joinColumns = @JoinColumn(name = "idGrupoDeDesarrollo"),
            inverseJoinColumns = @JoinColumn(name = "idEmpleado")
    )
    private List<empleado> empleados;


}

