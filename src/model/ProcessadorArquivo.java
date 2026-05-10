package model;

public abstract class ProcessadorArquivo {

    public final void processar() {

        abrirArquivo();
        lerDados();
        processarDados();
        fecharArquivo();

        System.out.println();
    }

    private void abrirArquivo() {
        System.out.println("Abrindo arquivo...");
    }

    private void fecharArquivo() {
        System.out.println("Fechando arquivo...");
    }

    protected abstract void lerDados();

    protected abstract void processarDados();
}