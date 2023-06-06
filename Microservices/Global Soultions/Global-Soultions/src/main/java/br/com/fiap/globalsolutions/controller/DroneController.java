package br.com.fiap.globalsolutions.controller;

import br.com.fiap.globalsolutions.domain.drone.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drones")
public class DroneController {

    @Autowired
    private DroneRepository droneRepository;

    @PostMapping
    @Transactional
    public void cadastrar (@RequestBody @Valid DadosCadastroDrone dados){
        droneRepository.save(new Drone(dados));
    }

    @GetMapping
    public Page<DadosListagemDrone> listar(@PageableDefault(size = 10, page = 0, sort = {"codigoDrone"}) Pageable paginacaoDrone){
        return droneRepository.findAllByAtivoTrue(paginacaoDrone).map(DadosListagemDrone::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoDrone dados){
        var drone = droneRepository.getReferenceById(dados.codigoDrone());
        drone.atualizarInformacoes(dados);
    }
    @DeleteMapping("/{codigoDrone}")
    @Transactional
    public void excluir(@PathVariable Long codigoDrone) {
        var drone = droneRepository.getReferenceById(codigoDrone);
        drone.excluir();
    }
}
