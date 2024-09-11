package com.gestion.empleados.gestion_empleados_backend.controlador;

import com.gestion.empleados.gestion_empleados_backend.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gestion.empleados.gestion_empleados_backend.modelo.repositorio.EmpleadoRepositorio;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoRepositorio repositorio;

    @GetMapping("/empleados")
    public List<Empleado> listarTodosLosEmpleados(){
        return repositorio.findAll();
    }
}
