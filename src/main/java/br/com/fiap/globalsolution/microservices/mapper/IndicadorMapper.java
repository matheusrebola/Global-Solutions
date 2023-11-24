package br.com.fiap.globalsolution.microservices.mapper;

import br.com.fiap.globalsolution.microservices.dto.IndicadorDTO;
import br.com.fiap.globalsolution.microservices.model.Indicador;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IndicadorMapper {
	private ModelMapper modelMapper;
    public IndicadorDTO map(Indicador indicador) {
        IndicadorDTO dto = modelMapper.map(indicador, IndicadorDTO.class);
        return dto;
    }
}
