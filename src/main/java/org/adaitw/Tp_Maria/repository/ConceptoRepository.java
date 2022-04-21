package org.adaitw.Tp_Maria.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.adaitw.Tp_Maria.entities.Concepto;

import java.util.Optional;


public interface ConceptoRepository extends JpaRepository<Concepto, Long> {

    Optional<Object> findByNombre(String num);
}