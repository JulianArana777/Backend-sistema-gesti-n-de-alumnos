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

import com.gestion.prueba.Entities.Materia;
import com.gestion.prueba.Services.MateriaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/materias")
@RequiredArgsConstructor

public class MateriaController {

    private final MateriaService materiaService;
    //registrar materia
    @PostMapping
    public Materia crear(@RequestBody Materia materia) {
        return materiaService.crear(materia);
    }

    //listar todas las materia
    @GetMapping
    public List<Materia> listar() {
        return materiaService.listar();
    }
    //listar materia x id
    @GetMapping("/{id}")
    public Materia obtener(@PathVariable Long id) {
        return materiaService.buscarPorId(id);
    }
    //actualizar materia
    @PutMapping("/{id}")
    public Materia actualizar(@PathVariable Long id, @RequestBody Materia materia) {
        return materiaService.actualizar(id, materia);
    }
    //borrar materia
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        materiaService.eliminar(id);
    }
    
}
