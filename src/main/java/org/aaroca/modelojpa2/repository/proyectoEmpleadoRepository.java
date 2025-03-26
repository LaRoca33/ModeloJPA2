package org.aaroca.modelojpa2.repository;

import org.aaroca.modelojpa2.entity.empleado;
import org.aaroca.modelojpa2.entity.proyectoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface proyectoEmpleadoRepository extends JpaRepository<proyectoEmpleado, Long> {

    // Buscar asignaciones de un empleado en proyectos
    List<proyectoEmpleado> findByEmpleado_Nombre(String nombreEmpleado);

    // Obtener empleados asignados a un proyecto específico
    @Query("SELECT pe.empleado FROM proyectoEmpleado pe WHERE pe.proyecto.nombre = :nombreProyecto")
    List<empleado> findEmpleadosByProyecto(@Param("nombreProyecto") String nombreProyecto);
}

