package com.gestion.prueba.Services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.prueba.Entities.Alumno;
import com.gestion.prueba.Entities.Materia;
import com.gestion.prueba.Entities.Nota;
import com.gestion.prueba.Repository.AlumnoRepository;
import com.gestion.prueba.Repository.MateriaRepository;
import com.gestion.prueba.Repository.NotaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class NotaService {

    private final NotaRepository notaRepository;
    private final AlumnoRepository alumnoRepository;
    private final MateriaRepository materiaRepository;


    //Registrar una nota dado una id de alumno, materia y un valor
    public Nota registrarNota(Long alumnoId, Long materiaId, Double valor) {
        Alumno alumno = alumnoRepository.findById(alumnoId)
                .orElseThrow(() -> new RuntimeException("Alumno no encontrado"));

        Materia materia = materiaRepository.findById(materiaId)
                .orElseThrow(() -> new RuntimeException("Materia no encontrada"));

        Nota nota = Nota.builder()
                .valor(valor)
                .fechaRegistro(LocalDate.now())
                .alumno(alumno)
                .materia(materia)
                .build();

        return notaRepository.save(nota);
    }

    //Listar notas x Alumno Id

    public List<Nota> listarPorAlumno(Long alumnoId) {
        return notaRepository.findByAlumnoId(alumnoId);
    }

    //Listar nota x Alumno ID y Materia Id

    public List<Nota> listarPorAlumnoYMateria(Long alumnoId, Long materiaId) {
        return notaRepository.findByAlumnoIdAndMateriaId(alumnoId, materiaId);
    }
    
}
