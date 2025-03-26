package org.aaroca.modelojpa2.entity;

import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Getter @Setter
public abstract class persona {
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String dni;
}
