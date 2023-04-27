package org.example;

public class ArquivoXML implements IArquivo{
    private String conteudo;

    @Override
    public String getConteudo() {return conteudo;}

    @Override
    public void setConteudo(String conteudo) {this.conteudo = conteudo;}
}
