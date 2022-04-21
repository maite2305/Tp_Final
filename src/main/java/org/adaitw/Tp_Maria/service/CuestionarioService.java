package org.adaitw.Tp_Maria.service;


import org.adaitw.Tp_Maria.entities.Concepto;

import org.adaitw.Tp_Maria.entities.Cuestionario;
import org.adaitw.Tp_Maria.entities.Pregunta;

import java.util.List;
import java.util.Optional;

public interface CuestionarioService {


    Optional<Concepto> findConceptoById(Long id);

    Optional<Pregunta> findPreguntaById(Long id);

    List<Cuestionario> getCuestionarioByConcepto(Long id);


}

