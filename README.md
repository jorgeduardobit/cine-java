# Cine Java

Sistema de console em Java que simula o cadastro de filmes e preços e a venda de ingressos em um atendimento de cinema.

> Projeto didático desenvolvido em sala de aula, em turma, como exercício da jornada de formação de tecnologia Transforma Futuros promovido pela Recode. Não tem intenção de uso real, serve apenas para fins de estudo.

## Status

Concluído. Todas as opções do menu estão implementadas: cadastro de filmes e preços, listagem e compra de ingressos.

## Funcionalidades

| Opção | Função | Situação |
|-------|--------|----------|
| 1 | Cadastrar filme (nome, gênero e classificação indicativa) | Pronto |
| 2 | Cadastrar preços de inteira e meia para um filme | Pronto |
| 3 | Listar filmes com classificação e preços | Pronto |
| 4 | Comprar ingressos (inteira ou meia) com resumo da compra | Pronto |
| 0 | Sair | Pronto |

Regras implementadas:

- Limite de 10 filmes cadastrados
- Só é possível cadastrar preços depois de cadastrar pelo menos um filme
- O preço da inteira deve ser maior que zero e o da meia não pode ser maior que o da inteira
- Filmes sem preço cadastrado aparecem na listagem como "Preço ainda não cadastrado"
- A compra só é concluída para filmes que já têm preço, e a quantidade de ingressos deve ser maior que zero
- O resumo da compra mostra filme, quantidade, preço unitário e total

## Conceitos praticados

- Entrada de dados com `Scanner`
- Menu com `do-while` e `switch` (incluindo `switch` aninhado)
- Vetores (arrays) paralelos para armazenar os dados dos filmes
- Estruturas de repetição e condicionais
- Validação de dados
- Formatação de valores monetários com `printf`

## Tecnologias

- Java 21
- Eclipse IDE

## Como executar

1. Clone o repositório:
   ```
   git clone https://github.com/jorgeduardobit/cine-java.git
   ```
2. No Eclipse, vá em **File > Import > Existing Projects into Workspace** e selecione a pasta clonada.
3. Abra a classe `CineJava.java` e clique em **Run**.

Ou, pelo terminal, dentro da pasta `src`:

```
javac CineJava.java
java CineJava
```

Observação: o separador decimal depende do idioma do sistema (em português, use vírgula).

## Exemplo de uso

```
===== CINE JAVA =====
1 - Cadastrar filme
2 - Cadastrar preço
3 - Listar filmes
4 - Comprar ingressos
0 - Sair
Escolha uma opção:
```

Exemplo de resumo de compra:

```
=== RESUMO DA COMPRA ===
Filme: Nome do filme
Quantidade: 2
Preço unitário: R$ 30,00
Total: R$ 60,00
```

## Possíveis melhorias

- Salvar os dados em arquivo ou banco de dados para não perder os filmes ao fechar o programa
- Tratamento de entradas inválidas (por exemplo, letras no lugar de números)

## Créditos

- Código desenvolvido em aula, no curso Transforma Futuros da Recode, sob orientação e com base nos exemplos do professor Jeferson Smith.
- Repositório mantido por Jorge Eduardo, estudante de Análise e Desenvolvimento de Sistemas, como registro dos estudos.
