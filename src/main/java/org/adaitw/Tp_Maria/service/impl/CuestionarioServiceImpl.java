package org.adaitw.Tp_Maria.service.impl;

import org.adaitw.Tp_Maria.entities.Concepto;
import org.adaitw.Tp_Maria.entities.Cuestionario;
import org.adaitw.Tp_Maria.entities.Pregunta;
import org.adaitw.Tp_Maria.entities.Respuesta;
import org.adaitw.Tp_Maria.repository.ConceptoRepository;
import org.adaitw.Tp_Maria.repository.PreguntaRepository;
import org.adaitw.Tp_Maria.repository.RespuestaRepository;
import org.adaitw.Tp_Maria.service.CuestionarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CuestionarioServiceImpl implements CuestionarioService {


    @Autowired
    PreguntaRepository preguntaRepository;

    @Autowired
    ConceptoRepository conceptoRepository;

    @Autowired
    RespuestaRepository respuestaRepository;

    ModelMapper modelMapper = new ModelMapper();


    @Override
    public Optional<Concepto> findConceptoById(Long id) {
        Optional<Concepto> concepto = conceptoRepository.findById(id);
        return concepto;
    }

    @Override
    public Optional<Pregunta> findPreguntaById(Long id) {
        Optional<Pregunta> pregunta = preguntaRepository.findById(id);
        return pregunta;
    }


    public List<Cuestionario> getCuestionarioByConcepto(Long id) {
        List<Pregunta> preguntas = preguntaRepository.findAllByConceptoId(id);
        List<Cuestionario> listCuestionario = new ArrayList<>();
        for (Pregunta prg : preguntas) {
            Set<Respuesta> respuestaset = prg.getRespuestas();
            List<Respuesta> respuestas = new ArrayList<>();
            for (Respuesta rpt : respuestaset) {
                 respuestas.add(rpt);
            }
            Optional<Concepto> concepto = conceptoRepository.findById(id);
            listCuestionario.add(new Cuestionario(concepto, prg, respuestas));
        }
        return listCuestionario;
    }


}
