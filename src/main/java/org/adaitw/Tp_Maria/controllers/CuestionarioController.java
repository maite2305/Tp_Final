package org.adaitw.Tp_Maria.controllers;


import org.adaitw.Tp_Maria.entities.Concepto;
import org.adaitw.Tp_Maria.entities.Cuestionario;
import org.adaitw.Tp_Maria.entities.Pregunta;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CuestionarioController {

    Optional<Concepto> getConceptoById(Long id);

    Optional<Pregunta> getPreguntaById(Long id);

    ResponseEntity<List<Cuestionario>> getCuestionarioByConceptoId(Long id);



}
