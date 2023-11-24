package br.com.fiap.globalsolution.microservices.controller;

import br.com.fiap.globalsolution.microservices.dto.IndicadorDTO;
import br.com.fiap.globalsolution.microservices.dto.ObjetivoDTO;
import br.com.fiap.globalsolution.microservices.mapper.IndicadorMapper;
import br.com.fiap.globalsolution.microservices.mapper.ObjetivoMapper;
import br.com.fiap.globalsolution.microservices.service.IndicadorService;
import br.com.fiap.globalsolution.microservices.service.ObjetivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/nascimentos")
@RequiredArgsConstructor
public class ObjetivosController {
    private ObjetivoService objetivoService;
    private ObjetivoMapper objetivoMapper;
    private IndicadorService indicadorService;
    private IndicadorMapper indicadorMapper;

    @GetMapping
    public ResponseEntity<List<ObjetivoDTO>> getAll() {
        List<ObjetivoDTO> result = objetivoService.getAll().stream().map(objetivoMapper::map).collect(Collectors.toList());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("{id}/indicadores")
    public ResponseEntity<List<IndicadorDTO>> findIndicadoresByObjetivoId(@PathVariable String id) {
        if (!objetivoService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        List<IndicadorDTO> dto = indicadorService.findByObjetivo(id).stream().map(indicadorMapper::map)
                .collect(Collectors.toList());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
