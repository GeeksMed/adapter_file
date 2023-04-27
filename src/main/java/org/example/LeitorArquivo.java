package org.example;

public class LeitorArquivo {
    IArquivo arquivo;
    ArquivoAdapter persistencia;

    public LeitorArquivo() {
        arquivo = new ArquivoXML();
        persistencia = new ArquivoAdapter(arquivo);
    }

    public void setArquivo(String conteudo) {
        arquivo.setConteudo(conteudo);
        persistencia.salvarArquivo();
    }

    public String getArquivo() {
        return persistencia.recuperarArquivo();
    }

    public String getConteudo() {
        return persistencia.getDicionario();
    }
}
