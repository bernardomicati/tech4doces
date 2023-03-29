package br.com.tech4doce.doceria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4doce.doceria.service.DoceService;
import br.com.tech4doce.doceria.shared.DoceCompletoDto;
import br.com.tech4doce.doceria.shared.DoceDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cardapio")
public class DoceController {
  @Autowired
  private DoceService servico;
  

  @PostMapping
  public ResponseEntity<DoceCompletoDto> cadastrarDoce(@RequestBody @Valid DoceCompletoDto doce){
    return new ResponseEntity<>(servico.cadastrar(doce), HttpStatus.CREATED); 
  }

  @GetMapping
  public ResponseEntity<List<DoceCompletoDto>> obterCardapio() {
    return new ResponseEntity<>(servico.obterTodas(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<DoceDto> obterDoce(@PathVariable String id) {
    Optional<DoceDto> retorno = servico.obterPorId(id);

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> excluirDoce(@PathVariable String id){
    servico.excluirPorId(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @PutMapping("/{id}")
  public ResponseEntity<DoceCompletoDto> atualizarDoce(@PathVariable String id, @RequestBody DoceCompletoDto doce){
    Optional<DoceCompletoDto> retorno = servico.atualizarPorId(id, doce); 

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }
   
  }

  @GetMapping("/porta")
  public String obterPorta(@Value("${local.server.port}") String porta){
    return "A instância a qual foi respondida está rodando na porta" + porta;
  }
  
}
