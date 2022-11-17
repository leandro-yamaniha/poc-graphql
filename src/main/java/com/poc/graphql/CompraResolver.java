package com.poc.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.poc.domain.*;
import com.poc.service.ClienteService;
import com.poc.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompraResolver implements GraphQLResolver<Compra> {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoService produtoService;

    public String status(Compra c) {
        return c.getStatus();
    }

    public Cliente cliente(Compra c) {
        return clienteService.findById(c.getCliente().getId());
    }

    public Produto produto(Compra c) {
        return produtoService.findById(c.getProduto().getId());
    }
}
