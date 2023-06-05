package br.com.fiap.globalsolutions.domain.drone;

public record DadosCadastroDrone(
        Long codigoDrone,
        String modelo,
        String numeroSerie,
        String horasVoo,
        String capacidadeCarga,
        String capacidadeBateria,

        //revisar licença
        String numeroLicenca,
        String dataLicenca,
        String validadeLicenca
) {
}
