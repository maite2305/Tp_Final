package org.adaitw.Tp_Maria.entities;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Data

public class Cuestionario implements Serializable {

    Optional<Concepto> concepto;
    Pregunta pregunta;
    List<Respuesta> respuestas;


    public Cuestionario(Optional<Concepto> concepto, Pregunta pregunta, List<Respuesta> respuestas) {
        this.concepto = concepto;
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }


}
