package br.com.fiap.globalsolutions.domain.drone;


public record DadosAtualizacaoDrone(
        Long codigoDrone,
        String modelo,
        String numeroSerie,
        String horasVoo,
        String capacidadeCarga,
        String capacidadeBateria,

        //revisar licença
        String numeroLicenca,
        String dataLicenca,
        String validadeLicenca,

        //revisar histórico de voo
        String dataVoo,
        String horario,
        String duracao,
        String coordenadas,
        String altitude,
        String velocidadeMedia
)
{

}
