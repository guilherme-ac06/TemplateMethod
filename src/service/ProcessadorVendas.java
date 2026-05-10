package service;

import model.*;

public class ProcessadorVendas extends ProcessadorArquivo {

    @Override
    protected void lerDados() {
        System.out.println("Lendo dados das vendas...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Processando informações das vendas...");
    }
}