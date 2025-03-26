package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;
import org.aaroca.modelojpa2.auxiliar.periodo;

@Entity
@Getter @Setter
public class edicionCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdicionCurso;

    @Embedded
    private periodo Periodo;

    @ManyToOne
    @JoinColumn(name = "idCurso", nullable = false)
    private cursoFormacion  curso;
}
