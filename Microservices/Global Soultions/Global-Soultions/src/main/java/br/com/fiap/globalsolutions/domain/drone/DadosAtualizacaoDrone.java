package br.com.fiap.globalsolutions.domain.drone;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoDrone(
        @NotNull
        Long codigoDrone,
        String modelo,
        String numeroSerie,
        String capacidadeCarga,
        String capacidadeBateria,
        String numeroLicenca,
        String dataLicenca,
        String validadeLicenca,
        String dataVoo,
        String horario,
        String duracao,
        String coordenadas,
        String altitude,
        String velocidadeMedia
)
{

}
