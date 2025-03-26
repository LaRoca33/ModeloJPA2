package org.aaroca.modelojpa2.repository;

import org.aaroca.modelojpa2.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface nominaRepository extends JpaRepository<nomina, Long> {

    // Obtener nóminas de un empleado
    List<nomina> findByEmpleado_Nombre(String nombreEmpleado);

    // Obtener nóminas de un año específico
    List<nomina> findByAnio(int anio);

    // Obtener nóminas de un empleado en un año determinado
    List<nomina> findByEmpleado_NombreAndAnio(String nombreEmpleado, int anio);
}
