package br.com.tech4doce.doceria.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4doce.doceria.model.Doce;
import br.com.tech4doce.doceria.repository.DoceRepository;
import br.com.tech4doce.doceria.shared.DoceCompletoDto;
import br.com.tech4doce.doceria.shared.DoceDto;

@Service
public class DoceServiceImpl implements DoceService {
  @Autowired
  private DoceRepository repositorio;

  @Override
  public List<DoceCompletoDto> obterTodas() {
    List<Doce> doces = repositorio.findAll();
    
    return doces.stream()
                .map(p -> new ModelMapper().map(p, DoceCompletoDto.class))
                .collect(Collectors.toList());
  }

  @Override
  public Optional<DoceDto> obterPorId(String id) {
    Optional<Doce> doce  = repositorio.findById(id);

    if (doce.isPresent()) {
      return Optional.of(new ModelMapper().map(doce.get(), DoceDto.class));
    }
    return Optional.empty();
  }

  @Override
  public void excluirPorId(String id) {
    repositorio.deleteById(id);
  }

  @Override
  public DoceCompletoDto cadastrar(DoceCompletoDto dto) {
    Doce doce = new ModelMapper().map(dto, Doce.class);
    repositorio.save(doce);
    return new ModelMapper().map(doce, DoceCompletoDto.class);  
  }

  @Override
  public Optional<DoceCompletoDto> atualizarPorId(String id, DoceCompletoDto dto) { 
    Optional<Doce> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      Doce doce = new ModelMapper().map(dto, Doce.class);
      doce.setId(id);
      repositorio.save(doce);
      return Optional.of(new ModelMapper().map(doce, DoceCompletoDto.class));
    } else {
      return Optional.empty();
    }
    
   
  }
  
}
