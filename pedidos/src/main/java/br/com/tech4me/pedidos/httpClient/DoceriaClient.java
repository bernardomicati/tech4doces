package br.com.tech4me.pedidos.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.pedidos.model.Doce;

@FeignClient(name = "doceria", fallback = DoceriaClientFallback.class)
public interface DoceriaClient{

    @RequestMapping(value="/cardapio/{id}", method=RequestMethod.GET)
    Doce obterDoce ( @PathVariable String id);

 }

@Component
class DoceriaClientFallback implements DoceriaClient {
@Override
public Doce obterDoce(String id) {
    return new Doce();
}

}