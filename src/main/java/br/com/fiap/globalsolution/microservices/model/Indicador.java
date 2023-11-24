package br.com.fiap.globalsolution.microservices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
