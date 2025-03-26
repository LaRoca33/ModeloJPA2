package org.aaroca.modelojpa2.auxiliar;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class direccion {
    private String tipoVia;
    private String via;
    private String numero;
    private int piso;
    private String puerta;
    private String localidad;
    private String CP;
    private String region;
    private String pais;
}
