package br.com.fiap.globalsolutions.domain.drone;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "drones")
@Entity(name = "Drone")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "codigoDrone")
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoDrone;
    private String modelo;
    private String numeroSerie;
    private String horasVoo;
    private String capacidadeCarga;
    private String capacidadeBateria;

    private Boolean ativo;

    //revisar licença depois
    private String numeroLicenca;
    private String dataLicenca;
    private String validadeLicenca;

    //revisar histórico de voo
    private String dataVoo;
    private String horario;
    private String duracao;
    private String coordenadas;
    private String altitude;
    private String velocidadeMedia;
}
