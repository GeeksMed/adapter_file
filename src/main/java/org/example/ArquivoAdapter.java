package org.example;

public class ArquivoAdapter extends ArquivoJSON{
    private IArquivo conteudo;

    public ArquivoAdapter(IArquivo conteudo) {
        this.conteudo = conteudo;
    }

    public String recuperarArquivo() {
        if (this.getDicionario().equals("Arquivo_XML")) {
            conteudo.setConteudo("Arquivo_JSON");
        }
        return conteudo.getConteudo();
    }

    public void salvarArquivo() {
        if (conteudo.getConteudo().equals("Arquivo_JSON"))
            this.setDicionario("Arquivo_XML");
    }
}
