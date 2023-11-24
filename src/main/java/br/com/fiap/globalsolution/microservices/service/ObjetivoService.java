package br.com.fiap.globalsolution.microservices.service;

import br.com.fiap.globalsolution.microservices.model.Objetivo;
import br.com.fiap.globalsolution.microservices.repository.ObjetivoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ObjetivoService {
	private ObjetivoRepository objetivoRepository;
    public List<Objetivo> getAll() {
        return objetivoRepository.findAll();

    }
    public boolean exists(String id) {
        return objetivoRepository.existsById(id);

    }
    public Objetivo findById(String id) {
        return objetivoRepository.findById(id).orElse(null);

    }
}
