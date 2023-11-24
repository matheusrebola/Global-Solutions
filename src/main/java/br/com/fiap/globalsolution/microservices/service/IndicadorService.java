package br.com.fiap.globalsolution.microservices.service;

import br.com.fiap.globalsolution.microservices.model.Indicador;
import br.com.fiap.globalsolution.microservices.repository.IndicadorRepository;

import java.util.List;

public class IndicadorService {
    private IndicadorRepository indicadorRepository;

    public List<Indicador> getAll() {
        return indicadorRepository.findAll();
    }
    public List<Indicador> findByObjetivo(String id) {
        return indicadorRepository.findByObjetivo(id);
    }
}
