package org.adaitw.Tp_Maria.controllers.impl;


import org.adaitw.Tp_Maria.controllers.CuestionarioController;
import org.adaitw.Tp_Maria.entities.Concepto;
import org.adaitw.Tp_Maria.entities.Cuestionario;
import org.adaitw.Tp_Maria.entities.Pregunta;
import org.adaitw.Tp_Maria.service.ConceptoService;
import org.adaitw.Tp_Maria.service.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cuestionario")
public class CuestionarioControllerImpl implements CuestionarioController {

    @Autowired
    ConceptoService conceptoService;

    @Autowired
    CuestionarioService cuestionarioService;

    @Override
    @GetMapping("/conceptos/{id}")
    public Optional<Concepto> getConceptoById(@PathVariable Long id) {

        return conceptoService.findConceptoById(id);
    }


    @GetMapping("/preguntas/{id}")
    public Optional<Pregunta> getPreguntaById(@PathVariable Long id) {
        return cuestionarioService.findPreguntaById(id);
    }


    @GetMapping("/cuestionario/{id}")
    public ResponseEntity<List<Cuestionario>> getCuestionarioByConceptoId(@PathVariable Long id){
        List<Cuestionario> cuestionarioList = cuestionarioService.getCuestionarioByConcepto(id);
        return ResponseEntity.ok().body(cuestionarioList);
    }







}
