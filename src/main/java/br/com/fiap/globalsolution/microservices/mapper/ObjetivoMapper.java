package br.com.fiap.globalsolution.microservices.mapper;

import br.com.fiap.globalsolution.microservices.dto.ObjetivoDTO;
import br.com.fiap.globalsolution.microservices.model.Objetivo;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ObjetivoMapper {
	 private ModelMapper modelMapper;

	    public ObjetivoDTO map(Objetivo objetivo) {
	        ObjetivoDTO dto = modelMapper.map(objetivo, ObjetivoDTO.class);
	        return dto;
	    }
}
