package br.com.fiap.globalsolutions.controller;


import br.com.fiap.globalsolutions.domain.telemetria.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/telemetria")
public class TelemetriaController {
    @Autowired
    private TelemetriaRepository telemetriaRepository;

    @PostMapping
    @Transactional
    public void cadastrar (@RequestBody @Valid DadosCadastroTelemetria dados){
        telemetriaRepository.save(new Telemetria(dados));
    }

    @GetMapping
    public Page<DadosListagemTelemetria> listar(@PageableDefault(size = 10, page = 0, sort = {"codigoTelemetria"}) Pageable paginacaoTelemetria){
        return telemetriaRepository.findAllByAtivoTrue(paginacaoTelemetria).map(DadosListagemTelemetria::new);
    }

    @PutMapping
    @Transactional
    public void atualizarDados(@RequestBody @Valid DadosAtualizacaoTelemetria dados){
        var telemetria = telemetriaRepository.getReferenceById(dados.codigoTelemetria());
        telemetria.atualizarInformacoes(dados);
    }
    @PutMapping
    @Transactional
    public void atualizarVoo(@RequestBody @Valid DadosAtualizacaoTelemetria dados){
        var telemetria = telemetriaRepository.getReferenceById(dados.codigoTelemetria());
        telemetria.atualizarInformacoes(dados);
    }
    @DeleteMapping("/{codigoTelemetria}")
    @Transactional
    public void excluir(@PathVariable Long codigoTelemetria) {
        var telemetria = telemetriaRepository.getReferenceById(codigoTelemetria);
        telemetria.excluir();
    }

}
