package com.gestion.prueba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gestion.prueba.Entities.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Long> {

}
