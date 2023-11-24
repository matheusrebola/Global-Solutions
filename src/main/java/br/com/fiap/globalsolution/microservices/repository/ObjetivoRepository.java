package br.com.fiap.globalsolution.microservices.repository;

import br.com.fiap.globalsolution.microservices.model.Objetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjetivoRepository extends JpaRepository<Objetivo, String> {
}
