package br.com.fiap.globalsolutions.domain.telemetria;

import jakarta.validation.constraints.NotNull;

public record DadosListagemTelemetria(
        @NotNull
        Long codigoTelemetria,
        String longitude,
        String latitude,
        String altitude,
        String velocidade,
        String direcao,
        String tempo
) {
    public DadosListagemTelemetria(Telemetria telemetria){

        this(
                telemetria.getCodigoTelemetria(),
                telemetria.getLongitude(),
                telemetria.getLatitude(),
                telemetria.getAltitude(),
                telemetria.getVelocidade(),
                telemetria.getDirecao(),
                telemetria.getTempo()
        );
    }
}
