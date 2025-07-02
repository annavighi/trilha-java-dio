
# Resolvendo desafios - Escopo e Estruturas de Controle em Java

## Pedra, Papel, Ataque Aéreo

Pedra, Papel, Ataque Aéreo é um jogo antigo mas que é popular até hoje. Nele, duas ou mais pessoas fazem gestos com a mão para vencer o adversário. 

As partidas são muito simples. Os jogadores podem escolher entre o sinal de uma Pedra (o punho), o sinal de um Papel (a palma aberta), e o sinal para o Ataque Aéreo (igual o do Papel, mas com apenas o polegar e o mindinho estendidos).

Uma partida, com dois jogadores, possuem as seguintes regras para se definir um vencedor:

- Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota o jogador com a Pedra, por razões óbvias.
- Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel, porque a Pedra machuca muito mais.
- Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo sempre ganha e o Papel é patético.
- Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o Papel é inútil e ninguém que enfrenta o Papel pode perder.
- Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
- Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores perdem, devido a Aniquilação Mútua.

## Entrada e Saída Lendo e Pulando Nomes
Faça um programa com as características abaixo:
- Leia 10 nomes, sem espaço em branco;
- Imprima o terceiro nome da lista;
- Imprima o sétimo nome da lista;
- Imprima o nono nome da lista.

### Entrada
A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada linha tem um nome de no até 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir.

### Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, gere três linhas conforme os procedimentos 2, 3 e 4.

## Mjölnir

Odin criou para Thor a mais fiel e poderosa arma possível, o martelo Mjölnir. Feito de um minério místico especial chamado Uru e forjado no coração de uma estrela pelos Deuses ferreiros de Asgard, Brokk e Eitri, os lendários ferreiros.

Um dia, Thor desafiou seus amigos para ver quem conseguia levantar o Mjölnir.

Escreva um programa que, dado um nome, e a força, em Newtons, aplicado ao tentar levantar o Mjölnir, informar se a pessoa conseguiu ou não levantá-lo.

### Entrada
Um número inteiro C será informado, que será a quantidade de casos de teste. Cada caso de teste inicia com uma palavra, que é o primeiro nome de quem está tentando levantar o Mjölnir, e um inteiro N (1 ≤ N ≤ 25000), indicando a força aplicada para cima, em Newtons, ao puxar o martelo, de modo a tentar levantá-lo.

### Saída
Para cada caso de teste imprima um caractere ‘Y’, caso a pessoa tenha conseguido levantar , ou ‘N’, caso não tenha conseguido.

V Olimpíada Interna de Programação do IFSULDEMINAS - OLIP 2015
