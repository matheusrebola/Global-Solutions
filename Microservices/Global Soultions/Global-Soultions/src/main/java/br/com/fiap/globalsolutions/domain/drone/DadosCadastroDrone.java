package br.com.fiap.globalsolutions.domain.drone;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroDrone(
        @NotBlank
        String modelo,
        @NotBlank
        String numeroSerie,
        @NotBlank
        String horasVoo,
        @NotBlank
        String capacidadeCarga,
        @NotBlank
        String capacidadeBateria,
        @NotBlank
        String numeroLicenca,
        @NotBlank
        String dataLicenca,
        @NotBlank
        String validadeLicenca
)
{

}
