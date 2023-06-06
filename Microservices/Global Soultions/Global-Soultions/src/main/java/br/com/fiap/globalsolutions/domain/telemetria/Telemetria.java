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


    public Telemetria(DadosCadastroTelemetria dados){
        this.longitude = dados.longitude();
        this.latitude = dados.latitude();
        this.altitude = dados.altitude();
        this.velocidade = dados.velocidade();
        this.direcao = dados.direcao();
        this.tempo = dados.tempo();
    }
    public void atualizarInformacoes(DadosAtualizacaoTelemetria dados){
        if (dados.longitude() != null) {
            this.longitude = dados.longitude();
        }
        if (dados.latitude() != null) {
            this.latitude = dados.latitude();
        }
        if (dados.altitude() != null) {
            this.altitude = dados.altitude();
        }
        if (dados.velocidade() != null) {
            this.velocidade = dados.velocidade();
        }
        if (dados.direcao() != null) {
            this.direcao = dados.direcao();
        }
        if (dados.tempo() != null) {
            this.tempo = dados.tempo();
        }
    }
    public void excluir() {
        this.ativo = false;
    }
}
