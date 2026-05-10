package app;

import service.*;

public class Main {

    public static void main(String[] args) {

        ProcessadorClientes clientes = new ProcessadorClientes();
        clientes.processar();

        ProcessadorProdutos produtos = new ProcessadorProdutos();
        produtos.processar();

        ProcessadorVendas vendas = new ProcessadorVendas();
        vendas.processar();
    }
}