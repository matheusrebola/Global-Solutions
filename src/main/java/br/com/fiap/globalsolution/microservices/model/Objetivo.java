package br.com.fiap.globalsolution.microservices.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Objetivo {
    @Id
    @GeneratedValue
    private String id;
}
