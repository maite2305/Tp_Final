package org.adaitw.Tp_Maria.controllers;

import java.util.List;
import java.util.Optional;
import org.adaitw.Tp_Maria.entities.Concepto;

public interface ConceptoController {

    List<Concepto> getConcepto();

    Optional<Concepto> getConceptoById(Long id);

    String crearConcepto (Concepto concepto);

    String eliminarConcepto(Long id);

    String actualizarConcepto(Concepto conceptoNuevo);


}