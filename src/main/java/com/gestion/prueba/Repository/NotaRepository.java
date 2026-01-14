package com.gestion.prueba.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.prueba.Entities.Nota;

public interface NotaRepository extends JpaRepository<Nota, Long> {

    List<Nota> findByAlumnoId(Long alumnoId);

    List<Nota> findByAlumnoIdAndMateriaId(Long alumnoId, Long materiaId);
}
