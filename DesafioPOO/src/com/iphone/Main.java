package com.iphone;


public class Main {
 public static void main(String[] args) {
     iPhone meuiPhone = new iPhone();

     // Comportamentos do Reprodutor Musical
     meuiPhone.selecionarMusica("Bohemian Rhapsody");
     meuiPhone.tocar();
     meuiPhone.pausar();

     // Comportamentos do Aparelho Telefônico
     meuiPhone.ligar("123456789");
     meuiPhone.atender();
     meuiPhone.iniciarCorreioVoz();

     // Comportamentos do Navegador na Internet
     meuiPhone.exibirPagina("www.openai.com");
     meuiPhone.adicionarNovaAba();
     meuiPhone.atualizarPagina();
 }
}
