package br.com.tech4doce.doceria.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4doce.doceria.model.Doce;

public interface DoceRepository extends MongoRepository<Doce, String> {
  
}
