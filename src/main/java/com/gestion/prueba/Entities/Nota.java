package com.gestion.prueba.Entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name= "notas")

public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double valor;
    private LocalDate fechaRegistro;
    @ManyToOne()
    @JoinColumn(name="alumno_id")
    @JsonIgnore//Evitar bucles infinitos a la hora de mover la info con un json
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "materia_id")    
    @JsonIgnore //Evitar bucles infinitos a la hora de mover la info con un json
    private Materia materia;



}
