package org.aaroca.modelojpa2.repository;
import org.aaroca.modelojpa2.entity.edicionCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface edicionCursoRepository extends JpaRepository<edicionCurso, Long> {

    // Obtener ediciones de un curso específico
    List<edicionCurso> findByCurso_Nombre(String nombreCurso);
}

