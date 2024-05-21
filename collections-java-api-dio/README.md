# Carrinho de Compras

Este repositório contém a implementação de um simples sistema de carrinho de compras em Java. O sistema permite adicionar, remover e listar itens, além de calcular o valor total da compra.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

1. `CarrinhoDeCompras`
2. `Item`

### Classe `CarrinhoDeCompras`

A classe `CarrinhoDeCompras` representa o carrinho de compras e contém os seguintes métodos:

- **adicionarItem(String nome, double preco, int quantidade):** Adiciona um item ao carrinho.
- **removerItem(String nome):** Remove um item do carrinho pelo nome.
- **calcularValorTotal():** Calcula o valor total dos itens no carrinho.
- **exibirItens():** Exibe todos os itens presentes no carrinho.

### Classe `Item`

A classe `Item` representa um item do carrinho e contém os seguintes atributos:

- **nome:** Nome do item.
- **preco:** Preço do item.
- **quant:** Quantidade do item.

