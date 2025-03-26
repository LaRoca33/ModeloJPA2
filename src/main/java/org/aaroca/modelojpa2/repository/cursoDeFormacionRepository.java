package org.aaroca.modelojpa2.repository;

import org.aaroca.modelojpa2.entity.cursoFormacion;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface cursoDeFormacionRepository extends JpaRepository<cursoFormacion, Long> {

    // Obtener cursos por nombre
    List<cursoFormacion> findByNombreContaining(String nombre);
}

