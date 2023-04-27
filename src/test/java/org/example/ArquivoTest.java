package org.example;

import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertEquals;

class ArquivoTest{
    @Test
    void deveRetornaArquivoJSON(){
        LeitorArquivo leitor = new LeitorArquivo();
        leitor.setArquivo("Arquivo_JSON");

        assertEquals("Arquivo_JSON", leitor.getArquivo());
    }
    @Test
    void deveRetornaArquivoXML(){
        LeitorArquivo leitor = new LeitorArquivo();
        leitor.setArquivo("Arquivo_JSON");

        assertEquals("Arquivo_XML", leitor.getConteudo());
    }


}