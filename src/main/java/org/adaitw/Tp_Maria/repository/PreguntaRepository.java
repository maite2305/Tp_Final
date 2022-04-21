package org.adaitw.Tp_Maria.repository;


import org.adaitw.Tp_Maria.entities.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;



public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
    List<Pregunta> findAllByConceptoId(Long id);

}