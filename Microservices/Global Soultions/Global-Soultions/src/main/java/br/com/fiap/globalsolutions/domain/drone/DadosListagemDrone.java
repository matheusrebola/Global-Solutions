package br.com.fiap.globalsolutions.domain.drone;

import jakarta.validation.constraints.NotNull;

public record DadosListagemDrone(
        Long codigoDrone,
        String modelo,
        String horasVoo,
        String capacidadeCarga,
        String capacidadeBateria,
        String dataVoo,
        String horario,
        String duracao,
        String coordenadas,
        String altitude,
        String velocidadeMedia
)
{
    public DadosListagemDrone(Drone drone){
        this(
                drone.getCodigoDrone(),
                drone.getModelo(),
                drone.getHorasVoo(),
                drone.getCapacidadeCarga(),
                drone.getCapacidadeBateria(),
                drone.getDataVoo(),
                drone.getHorario(),
                drone.getDuracao(),
                drone.getCoordenadas(),
                drone.getAltitude(),
                drone.getVelocidadeMedia()
        );
    }
}
