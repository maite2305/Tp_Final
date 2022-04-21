package org.adaitw.Tp_Maria.service;

import java.util.List;
import java.util.Optional;
import org.adaitw.Tp_Maria.entities.Concepto;

public interface ConceptoService {
    List<Concepto> findAllConceptos();

    Optional<Concepto> findConceptoById(Long id);

    String deleteConcepto(Long id);

    String actualizarConcepto(Concepto conceptoNuevo);

    String crearConcepto(Concepto concepto);


}