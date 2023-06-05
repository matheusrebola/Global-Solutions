package br.com.fiap.globalsolutions.domain.telemetria;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "telemetrias")
@Entity(name = "Telemetria")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "codigoTelemetria")
public class Telemetria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoTelemetria;
    private String longitude;
    private String latitude;
    private String altitude;
    private String velocidade;
    private String direcao;
    private String tempo;

    private Boolean ativo;
}
