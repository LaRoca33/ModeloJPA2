package org.aaroca.modelojpa2;
import org.aaroca.modelojpa2.auxiliar.periodo;
import org.aaroca.modelojpa2.entity.proyectoEmpleado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

@SpringBootTest
public class ProyectoEmpleadoTest {

    @Autowired
    private ProyectoEmpleadoRepository proyectoEmpleadoRepository;

    @Test
    public void testCrearProyectoEmpleadoConPeriodo() {
        proyectoEmpleado pe = new proyectoEmpleado();

        periodo Periodo = new periodo();
        Periodo.setFechaInicio(LocalDate.of(2024, 3, 1));
        Periodo.setFechaFin(LocalDate.of(2024, 12, 31));

        pe.setPeriodo(Periodo);
        proyectoEmpleadoRepository.save(pe);

        assertNotNull(pe.getId());
        assertEquals(LocalDate.of(2024, 3, 1), pe.getPeriodo().getFechaInicio());
    }
}

