package org.aaroca.modelojpa2.components;
import org.aaroca.modelojpa2.auxiliar.periodo;
import org.aaroca.modelojpa2.entity.empleado;
import org.aaroca.modelojpa2.entity.proyecto;
import org.aaroca.modelojpa2.entity.proyectoEmpleado;
import org.aaroca.modelojpa2.repository.empleadoRepository;
import org.aaroca.modelojpa2.repository.proyectoEmpleadoRepository;
import org.aaroca.modelojpa2.repository.proyectoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class cargaDatos implements CommandLineRunner {

    private final empleadoRepository EmpleadoRepository;
    private final proyectoRepository ProyectoRepository;
    private final proyectoEmpleadoRepository ProyectoEmpleadoRepository;

    public DataLoader(empleadoRepository EmpleadoRepository, proyectoRepository ProyectoRepository, proyectoEmpleadoRepository ProyectoEmpleadoRepository) {
        this.EmpleadoRepository = EmpleadoRepository;
        this.ProyectoRepository = ProyectoRepository;
        this.ProyectoEmpleadoRepository = ProyectoEmpleadoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear un Proyecto
        proyecto Proyecto = new proyecto();
        proyecto.setNombre("Sistema de Inventario");
        proyectoRepository.save(Proyecto);

        // Crear un Empleado
        empleado Empleado = new empleado();
        empleado.setNombre("María Gómez");
        empleado.setSalario(48000);
        empleadoRepository.save(Empleado);

        // Crear un ProyectoEmpleado con un período
        proyectoEmpleado pe = new proyectoEmpleado();
        pe.setProyecto(proyecto);
        pe.setEmpleado(empleado);

        periodo Periodo = new periodo();
        periodo.setFechaInicio(LocalDate.of(2024, 1, 1));
        periodo.setFechaFin(LocalDate.of(2024, 6, 30));
        pe.setPeriodo(Periodo);

        proyectoEmpleadoRepository.save(pe);
    }
}
