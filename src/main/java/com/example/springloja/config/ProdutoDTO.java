package com.example.springloja.config;

import com.example.springloja.entities.Produto;

public record ProdutoDTO(
        Long id,
        Double preco,
        String nomeCategoria
) {
    public ProdutoDTO(Produto p)
    {
        this(p.getId(), p.getPreco(), p.getCategoria().getNome());
    }
}
