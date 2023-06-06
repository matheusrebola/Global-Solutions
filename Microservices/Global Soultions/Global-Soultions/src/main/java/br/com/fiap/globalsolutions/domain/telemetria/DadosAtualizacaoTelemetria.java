package br.com.fiap.globalsolutions.domain.telemetria;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTelemetria(
        @NotNull
        Long codigoTelemetria,
        String longitude,
        String latitude,
        String altitude,
        String velocidade,
        String direcao,
        String tempo
) {
}
