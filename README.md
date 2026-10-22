# Cine Java

Sistema de console em Java que simula o cadastro de filmes e preços em um atendimento de cinema.

> Projeto didático desenvolvido em sala de aula, em turma, como exercício da jornada de formação de tecnologia Transforma Futuros promovido pela Recode. Não tem intenção de uso real, serve apenas para fins de estudo.

## Status

Em desenvolvimento. As opções de cadastro já funcionam; listagem de filmes e compra de ingressos ainda estão sendo implementadas.

## Funcionalidades

| Opção | Função | Situação |
|-------|--------|----------|
| 1 | Cadastrar filme (nome, gênero e classificação indicativa) | Pronto |
| 2 | Cadastrar preços de inteira e meia para um filme | Em desenvolvimento |
| 3 | Listar filmes | Em desenvolvimento |
| 4 | Comprar ingressos | Em desenvolvimento |
| 0 | Sair | Pronto |

Regras já implementadas:

- Limite de 10 filmes cadastrados
- Só é possível cadastrar preços depois de cadastrar pelo menos um filme
- O preço da inteira deve ser maior que zero e o da meia não pode ser maior que o da inteira

## Conceitos praticados

- Entrada de dados com `Scanner`
- Menu com `do-while` e `switch`
- Vetores (arrays) paralelos para armazenar os dados dos filmes
- Estruturas de repetição e condicionais
- Validação de dados

## Tecnologias

- Java [21]
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

Observação: ao digitar preços, use vírgula como separador decimal (ex: `25,50`).

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

## Créditos

- Código desenvolvido em aula, no curso Transforma Futuros da Recode, sob orientação e com base nos exemplos do professor Jeferson Smith.
- Repositório mantido por Jorge Eduardo, estudante de Análise e Desenvolvimento de Sistemas, como registro dos estudos.
