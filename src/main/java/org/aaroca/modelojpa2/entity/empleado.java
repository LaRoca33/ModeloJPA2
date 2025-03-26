package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;
import org.aaroca.modelojpa2.auxiliar.direccion;

import java.util.List;

@Entity
@Getter @Setter
public class empleado extends persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;


    @Embedded
    private direccion Direccion;

    @ManyToOne
    @JoinColumn(name = "idDepartamento", nullable = false)
    private departamento departamento;

    @OneToMany(mappedBy = "empleado")
    private List<nomina> nominas;

    @OneToMany(mappedBy = "idPuesto")
    private List<puesto> puestos;



    @ManyToMany
    @JoinTable(
            name = "empleado_curso",
            joinColumns = @JoinColumn(name = "idEmpleado"),
            inverseJoinColumns = @JoinColumn(name = "idCurso")
    )
    private List<cursoFormacion> cursos;
}

