package com.gestion.prueba.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.prueba.Entities.Alumno;
import com.gestion.prueba.Services.AlumnoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/alumnos")
@RequiredArgsConstructor

public class AlumnoController {
    private final AlumnoService alumnoService;
    //crear alumno
    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno) {
        return alumnoService.crear(alumno);
    }
    //listar todos los alumnos
    @GetMapping
    public List<Alumno> listar() {
        return alumnoService.listar();
    }
    //listar alumno x id
    @GetMapping("/{id}")
    public Alumno obtener(@PathVariable Long id) {
        return alumnoService.buscarPorId(id);
    }
    //actualizar alumno
    @PutMapping("/{id}")
    public Alumno actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        return alumnoService.actualizar(id, alumno);
    }
    //borrar alumno
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        alumnoService.eliminar(id);
    }
}
