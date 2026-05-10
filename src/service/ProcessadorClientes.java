package service;

import model.*;

public class ProcessadorClientes extends ProcessadorArquivo {

    @Override
    protected void lerDados() {
        System.out.println("Lendo dados dos clientes...");
    }

    @Override
    protected void processarDados() {
        System.out.println("Processando informações dos clientes...");
    }
}