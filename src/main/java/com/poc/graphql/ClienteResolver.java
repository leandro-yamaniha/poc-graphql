package com.poc.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.poc.domain.Cliente;
import com.poc.domain.Compra;
import com.poc.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteResolver implements GraphQLResolver<Cliente> {

    @Autowired
    private CompraService compraService;

    public List<Compra> compras(Cliente c) {
        return compraService.findAllByCliente(c);
    }
}
