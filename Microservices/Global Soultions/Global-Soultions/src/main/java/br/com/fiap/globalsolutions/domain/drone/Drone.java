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

    public Drone(DadosCadastroDrone dados){
        this.modelo = dados.modelo();
        this.numeroSerie = dados.numeroSerie();
        this.horasVoo = dados.horasVoo();
        this.capacidadeCarga = dados.capacidadeCarga();
        this.capacidadeBateria = dados.capacidadeBateria();
        this.numeroLicenca = dados.numeroLicenca();
        this.dataLicenca = dados.dataLicenca();
        this.validadeLicenca = dados.validadeLicenca();
    }
    public void atualizarInformacoes(DadosAtualizacaoDrone dados){
        if (dados.modelo() != null) {
            this.modelo = dados.modelo();
        }
        if (dados.modelo() != null) {
            this.modelo = dados.modelo();
        }
        if (dados.numeroSerie() != null) {
            this.numeroSerie = dados.numeroSerie();
        }
        if (dados.capacidadeCarga() != null) {
            this.capacidadeCarga = dados.capacidadeCarga();
        }
        if (dados.capacidadeBateria() != null) {
            this.capacidadeBateria = dados.capacidadeBateria();
        }
        if (dados.numeroLicenca() != null) {
            this.numeroLicenca = dados.numeroLicenca();
        }
        if (dados.dataLicenca() != null) {
            this.dataLicenca = dados.dataLicenca();
        }
        if (dados.validadeLicenca() != null) {
            this.validadeLicenca = dados.validadeLicenca();
        }
    }
    public void relatarVoo(DadosAtualizacaoDrone dados){
        if (dados.dataVoo() != null) {
            this.dataVoo = dados.dataVoo();
        }
        if (dados.horario() != null) {
            this.horario = dados.horario();
        }
        if (dados.duracao() != null) {
            this.duracao = dados.duracao();
        }
        if (dados.coordenadas() != null) {
            this.coordenadas = dados.coordenadas();
        }
        if (dados.altitude() != null) {
            this.altitude = dados.altitude();
        }
        if (dados.velocidadeMedia() != null) {
            this.velocidadeMedia = dados.velocidadeMedia();
        }
    }
    public void excluir() {
        this.ativo = false;
    }
}
