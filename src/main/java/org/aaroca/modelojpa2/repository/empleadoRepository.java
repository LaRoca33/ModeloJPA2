package org.aaroca.modelojpa2.repository;

import org.aaroca.modelojpa2.entity.empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface empleadoRepository extends JpaRepository<empleado, Long> {

    // Buscar empleados por nombre
    List<empleado> findByNombre(String nombre);

    // Buscar empleados con salario mayor a cierto monto
    List<empleado> findByCGreaterThan(double salario);

    // Buscar empleados de un departamento específico
    List<empleado> findByDepartamento_Nombre(String departamentoNombre);

    // Contar empleados por departamento
    long countByDepartamento_Nombre(String departamentoNombre);

    // Obtener empleados con un salario entre dos valores
    List<empleado> findBySalarioBetween(double min, double max);

    // Obtener empleados con más de cierta cantidad de nóminas (JPQL)
    @Query("SELECT e FROM empleado e WHERE SIZE(e.nominas) > :cantidad")
    List<empleado> findByNominasGreaterThan(@Param("cantidad") int cantidad);
}
