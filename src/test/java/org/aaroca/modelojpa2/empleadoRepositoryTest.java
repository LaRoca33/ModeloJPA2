package org.aaroca.modelojpa2;

import org.aaroca.modelojpa2.entity.empleado;
import org.aaroca.modelojpa2.repository.empleadoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class empleadoRepositoryTest {
    @Autowired
    private empleadoRepository EmpleadoRepository;

    @Test
    public void testBuscarPorSalario() {
        List<empleado> Empleados = empleadoRepository.findBySalarioGreaterThan(40000.0);
        assertFalse(Empleados.isEmpty());
    }
}

