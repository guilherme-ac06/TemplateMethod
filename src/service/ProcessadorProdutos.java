package service;

import model.*;

public class ProcessadorProdutos extends ProcessadorArquivo {

    @Override
    protected void lerDados() {
        System.out.println("Lendo dados dos produtos...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Processando informações dos produtos...");
    }
}