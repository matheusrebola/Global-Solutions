package br.com.fiap.globalsolution.microservices.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Indicador {
	@Id
    private String id;

    @ManyToOne(optional = false)
    private Objetivo objetivo;

    @Column(nullable = false, length = 100)
    private String desc;
}
