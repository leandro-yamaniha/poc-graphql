package com.poc.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.poc.domain.Produto;
import com.poc.service.ProdutoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ProdutoService service;

    public Produto produto(Long id) {
        return service.findById(id);
    }

    public List<Produto> getProdutos() {
        return service.findAll();
    }

    public Produto saveProduto(ProdutoInput input) {
        ModelMapper m = new ModelMapper();
        Produto c = m.map(input,Produto.class);

        return service.save(c);
    }

    public Boolean deleteProduto(Long id) {
        return service.deleteById(id);
    }
}
