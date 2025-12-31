package com.seuusuario.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new FactoryProduto();

        Produto produto1 = factory.criarProduto("A");
        Produto produto2 = factory.criarProduto("B");

        produto1.exibirInfo();
        produto2.exibirInfo();
    }
}
