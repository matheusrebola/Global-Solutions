package br.com.fiap.globalsolutions.domain.drone;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneRepository extends JpaRepository<Drone, Long> {
    Page<Drone> findAllByAtivoTrue(Pageable paginacaoCliente);
}
