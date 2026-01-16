package com.gestion.prueba.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.prueba.Entities.Materia;
import com.gestion.prueba.Repository.MateriaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class MateriaService {
    private final MateriaRepository materiaRepository;

    //Crear una materia
    public Materia crear(Materia materia) {
        return materiaRepository.save(materia);
    }

    //Listar todas las materias 
    public List<Materia> listar() {
        return materiaRepository.findAll();
    }

    // Listar una materia x Id
    public Materia buscarPorId(Long id) {
        return materiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Materia no encontrada"));
    }

    //Actualizar una Materia
    public Materia actualizar(Long id, Materia materia) {
        Materia existente = buscarPorId(id);
        existente.setNombre(materia.getNombre());
        existente.setCodigo(materia.getCodigo());
        existente.setCreditos(materia.getCreditos());
        return materiaRepository.save(existente);
    }

    //Eliminar una Materia

    public void eliminar(Long id) {
        materiaRepository.deleteById(id);
    }
}
