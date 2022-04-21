package org.adaitw.Tp_Maria.controllers.impl;

import java.util.List;
import java.util.Optional;

import org.adaitw.Tp_Maria.service.ConceptoService;
import org.adaitw.Tp_Maria.entities.Concepto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.adaitw.Tp_Maria.controllers.ConceptoController;

@RestController
@RequestMapping("/concepto")
public class ConceptoControllerImpl implements ConceptoController {
    @Autowired
    ConceptoService conceptoService;

    @Override
    @GetMapping({"", "/"})
    public List<Concepto> getConcepto() {

        return conceptoService.findAllConceptos();
    }

    @Override
    @GetMapping("/conceptos/{id}")
    public Optional<Concepto> getConceptoById(@PathVariable Long id) {
        return conceptoService.findConceptoById(id);
    }

    @Override
    @PostMapping("/crear")
    public String crearConcepto(@RequestBody Concepto concepto) {
        System.out.println("crear: " + concepto.toString());
        return conceptoService.crearConcepto(concepto);
    }

    @Override
    @DeleteMapping("/eliminar/{id}")
    public String eliminarConcepto(@PathVariable Long id) {
        return conceptoService.deleteConcepto(id);
    }

    @Override
    @PutMapping("/actualizar")
    public String actualizarConcepto(@RequestBody Concepto conceptoNuevo) {
        return conceptoService.actualizarConcepto(conceptoNuevo);

    }

}