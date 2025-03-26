package org.aaroca.modelojpa2.repository;

import org.aaroca.modelojpa2.entity.departamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface departamentoRepository extends JpaRepository<departamento, Long> {

    // Buscar departamento por nombre
    Optional<departamento> findByNombre(String nombre);

    // Obtener todos los departamentos con presupuesto mayor a un valor
    List<departamento> findByPresupuestoGreaterThan(double presupuesto);
}
