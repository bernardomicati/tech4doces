package br.com.tech4doce.doceria.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4doce.doceria.shared.DoceCompletoDto;
import br.com.tech4doce.doceria.shared.DoceDto;


public interface DoceService {
  List<DoceCompletoDto> obterTodas();
  Optional<DoceDto> obterPorId(String id);
  void excluirPorId(String id);
  DoceCompletoDto cadastrar(DoceCompletoDto dto);
  Optional<DoceCompletoDto> atualizarPorId(String id, DoceCompletoDto dto);
}
