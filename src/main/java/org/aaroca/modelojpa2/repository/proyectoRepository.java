package org.aaroca.modelojpa2.repository;

import org.aaroca.modelojpa2.entity.proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface proyectoRepository extends JpaRepository<proyecto, Long> {

    // Buscar proyectos por nombre
    List<proyecto> findByNombreContaining(String nombre);

    // Obtener proyectos con más de cierto número de empleados
    @Query("SELECT p FROM proyecto p WHERE SIZE(p.empleados) > :minEmpleados")
    List<proyecto> findByEmpleadosCountGreaterThan(@Param("minEmpleados") int minEmpleados);
}

