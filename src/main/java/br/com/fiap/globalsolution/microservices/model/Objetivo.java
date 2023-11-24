package br.com.fiap.globalsolution.microservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Objetivo {
    @Id
    @GeneratedValue
    private String id;
}
