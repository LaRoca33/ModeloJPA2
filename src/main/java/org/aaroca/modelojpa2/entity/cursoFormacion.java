package org.aaroca.modelojpa2.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter @Setter
public class cursoFormacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;
    @ManyToOne
    @JoinColumn(name = "idJefe")
    private empleado jefe;

    @OneToMany(mappedBy = "jefe")
    private List<empleado> subordinados;

    private String nombre;
    private int horas;

    @ManyToMany(mappedBy = "cursos")
    private List<empleado> empleados;
}

