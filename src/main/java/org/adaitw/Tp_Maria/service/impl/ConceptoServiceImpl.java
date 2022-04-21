package org.adaitw.Tp_Maria.service.impl;


import java.util.List;
import java.util.Optional;

import org.adaitw.Tp_Maria.entities.Concepto;
import org.adaitw.Tp_Maria.repository.ConceptoRepository;
import org.adaitw.Tp_Maria.service.ConceptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConceptoServiceImpl implements ConceptoService {

    @Autowired
    ConceptoRepository conceptoRepository;

    @Override
    public List<Concepto> findAllConceptos() {
        List<Concepto> conceptoList = conceptoRepository.findAll();
        return conceptoList;
    }

    @Override
    public Optional<Concepto> findConceptoById(Long id) {
        Optional<Concepto> concepto = conceptoRepository.findById(id);
        return concepto;
    }

    public String crearConcepto(Concepto concepto) {
        System.out.println("crearConcepto: " + concepto.toString());
        conceptoRepository.save(concepto);
        return "Usted ha creado un concepto";
    }

    @Override
    public String actualizarConcepto(Concepto conceptoUpdated) {
        String num = conceptoUpdated.getNombre();
        if (conceptoRepository.findByNombre(num).isPresent()) {
            Concepto conceptoToUpdate = new Concepto();
            conceptoToUpdate.setNombre(conceptoUpdated.getNombre());
            conceptoToUpdate.setContenido(conceptoUpdated.getContenido());
            conceptoRepository.save(conceptoToUpdate);
            return "Concepto modificado";
        }
        return "Error al modificar el Concepto";
    }

    @Override
    public String deleteConcepto(Long id) {
        if (conceptoRepository.findById(id).isPresent()) {
            conceptoRepository.deleteById(id);
            return "Concepto eliminado correctamente.";
        }
        return "Error! concepto no existe";
    }
}






