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

    public cargaDatos(empleadoRepository EmpleadoRepository, proyectoRepository ProyectoRepository, proyectoEmpleadoRepository ProyectoEmpleadoRepository) {
        this.EmpleadoRepository = EmpleadoRepository;
        this.ProyectoRepository = ProyectoRepository;
        this.ProyectoEmpleadoRepository = ProyectoEmpleadoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Crear un Proyecto
        proyecto Proyecto = new proyecto();
        Proyecto.setNombre("Sistema de Inventario");
        ProyectoRepository.save(Proyecto);

        // Crear un Empleado
        empleado Empleado = new empleado();
        Empleado.setNombre("María Gómez");
        EmpleadoRepository.save(Empleado);

        // Crear un ProyectoEmpleado con un período
        proyectoEmpleado pe = new proyectoEmpleado();
        pe.setProyecto(Proyecto);
        pe.setEmpleado(Empleado);


        ProyectoEmpleadoRepository.save(pe);
    }
}
