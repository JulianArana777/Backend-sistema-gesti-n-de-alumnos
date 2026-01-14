package com.gestion.prueba.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.prueba.Entities.Alumno;
import com.gestion.prueba.Repository.AlumnoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public Alumno crear(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public List<Alumno> listar() {
        return alumnoRepository.findAll();
    }

    public Alumno buscarPorId(Long id) {
        return alumnoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));
    }

    public Alumno actualizar(Long id, Alumno alumno) {
        Alumno existente = buscarPorId(id);
        existente.setNombre(alumno.getNombre());
        existente.setApellido(alumno.getApellido());
        existente.setEmail(alumno.getEmail());
        existente.setFechaNacimiento(alumno.getFechaNacimiento());
        return alumnoRepository.save(existente);
    }

    public void eliminar(Long id) {
        alumnoRepository.deleteById(id);
    }
}
