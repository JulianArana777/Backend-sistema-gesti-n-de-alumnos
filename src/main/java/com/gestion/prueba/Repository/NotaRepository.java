package com.gestion.prueba.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.prueba.Entities.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {

    //Encontrar nota en la db x id de alumno
    List<Nota> findByAlumnoId(Long alumnoId);
    // Encontrar nota en ela db x id de alumno y id de materia 
    List<Nota> findByAlumnoIdAndMateriaId(Long alumnoId, Long materiaId);
}
