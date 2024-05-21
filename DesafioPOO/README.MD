# Desafio POO: Modelagem e Diagramação de um Componente iPhone

Este repositório contém a solução para o desafio de Programação Orientada a Objetos (POO) focado na modelagem e diagramação de um componente iPhone. O objetivo foi criar um diagrama UML e implementar classes em Java que representassem as funcionalidades de um iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Funcionalidades Implementadas

### Reprodutor Musical
- **Métodos**:
  - `tocar()`: Inicia a reprodução de uma música.
  - `pausar()`: Pausa a música que está sendo reproduzida.
  - `selecionarMusica(String musica)`: Seleciona uma música específica para reprodução.

### Aparelho Telefônico
- **Métodos**:
  - `ligar(String numero)`: Faz uma ligação para o número especificado.
  - `atender()`: Atende uma chamada.
  - `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet
- **Métodos**:
  - `exibirPagina(String url)`: Exibe uma página da web a partir da URL fornecida.
  - `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
  - `atualizarPagina()`: Atualiza a página atual.

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorNaInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorNaInternet



poo-desafio-iphone
│   README.md
│
└───src
    └───main
        └───java
            ├───ReprodutorMusical.java
            ├───AparelhoTelefonico.java
            └───NavegadorNaInternet.java

