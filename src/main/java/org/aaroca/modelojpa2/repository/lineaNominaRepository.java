package org.aaroca.modelojpa2.repository;

import org.aaroca.modelojpa2.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface lineaNominaRepository extends JpaRepository<lineaNomina, Long> {

    // Obtener líneas de nómina por concepto
    List<lineaNomina> findByConcepto(String concepto);

    // Obtener líneas de nómina de una nómina específica
    List<lineaNomina> findByNomina_Id(Long nominaId);
}

