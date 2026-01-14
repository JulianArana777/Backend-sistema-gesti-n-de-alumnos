package com.gestion.prueba.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.prueba.Entities.Nota;
import com.gestion.prueba.Services.NotaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/notas")
@RequiredArgsConstructor

public class NotaController {

     private final NotaService notaService;

    // Registrar nota
    @PostMapping
    public Nota registrar(
            @RequestParam Long alumnoId,
            @RequestParam Long materiaId,
            @RequestParam Double valor
    ) {
        return notaService.registrarNota(alumnoId, materiaId, valor);
    }

    // Listar notas x alumno
    @GetMapping("/alumno/{alumnoId}")
    public List<Nota> listarPorAlumno(@PathVariable Long alumnoId) {
        return notaService.listarPorAlumno(alumnoId);
    }

    // Listar notas x alumno y materia
    @GetMapping("/alumno/{alumnoId}/materia/{materiaId}")
    public List<Nota> listarPorAlumnoYMateria(
            @PathVariable Long alumnoId,
            @PathVariable Long materiaId
    ) {
        return notaService.listarPorAlumnoYMateria(alumnoId, materiaId);
    }
    
}
