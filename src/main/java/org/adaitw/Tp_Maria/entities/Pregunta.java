package org.adaitw.Tp_Maria.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "preguntas")

public class Pregunta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_pregunta")
    Long id;
    @Column(name = "contenido", nullable = false)
    String contenido;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_concepto")
    private Concepto concepto;

    @JsonIgnore
    @OneToMany(mappedBy = "pregunta")
    private Set<Respuesta> respuestas = new HashSet();
}
