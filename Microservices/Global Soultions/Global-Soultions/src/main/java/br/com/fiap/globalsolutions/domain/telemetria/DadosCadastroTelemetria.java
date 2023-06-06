package br.com.fiap.globalsolutions.domain.telemetria;

public record DadosCadastroTelemetria(
        String longitude,
        String latitude,
        String altitude,
        String velocidade,
        String direcao,
        String tempo
) {
}
