package org.aaroca.modelojpa2.auxiliar;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Embeddable
@Getter @Setter
public class periodo {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}

