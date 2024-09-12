package com.gestion.empleados.gestion_empleados_backend.repositorio;

import com.gestion.empleados.gestion_empleados_backend.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {

}
