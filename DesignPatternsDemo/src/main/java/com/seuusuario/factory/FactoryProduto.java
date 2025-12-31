package com.seuusuario.factory;

public class FactoryProduto implements Factory {
    @Override
    public Produto criarProduto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "a":
                return new ProdutoA();
            case "b":
                return new ProdutoB();
            default:
                throw new IllegalArgumentException("Tipo de produto inválido");
        }
    }
}
