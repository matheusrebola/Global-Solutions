package br.com.fiap.globalsolutions.domain.telemetria;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelemetriaRepository extends JpaRepository<Telemetria, Long> {
    Page<Telemetria> findAllByAtivoTrue(Pageable paginacaoCliente);
}
