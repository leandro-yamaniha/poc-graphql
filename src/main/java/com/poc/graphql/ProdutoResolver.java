package com.poc.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.poc.domain.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoResolver implements GraphQLResolver<Produto> {

    public String valorReais(Produto p) {
        return "R$"+p.getValor();
    }
}
