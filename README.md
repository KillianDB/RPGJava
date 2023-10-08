# RPGJava

Atividade de aula:

"RPG Simples
Para aula de hoje, você irá se juntar a um grupo e criar um personagem de RPG. Cada
grupo terá 10 pontos para distribuir entre os atributos que serão listados abaxo.
O personagem do grupo deve ser um objeto de alguma das seguintes classes:
Guerreiro, Mago ou Ladino.
As classes seguem uma estrutura semelhante. Todo personagem possui os atributos:
• Resistência = Definido pelo Usuário
• Força = Definido pelo Usuário
• Inteligência = Definido pelo Usuário
• Vida = 10 * Resistência
• Magia = 10 * Inteligência
• Nome = Definido pelo Usuário
Os personagens também devem implementar alguns métodos obrigatórios:
• atacar = Deve mulUplicar a força por um valor aleatório entre 1 e 10,
retornando um inteiro
• moverParaFrente = Deve retornar a String “{nome_personagem} anda
para frente.”
• receberDano = Deve alterar a vida do personagem para ser igual ao valor
anterior menos o dano recebido por parâmetro. Deve retornar a String
“{nome_personagem} está com {vida_personagem} pontos de vida.” Se
o valor de Vida chegar a zero, deve apresentar a String de que o
personagem morreu.
Cada classe possui uma capacidade específica:
• Guerreiro: receberDano possui um parâmetro a mais, onde o guerreiro
pode definir se prefere gastar 5 pontos de Magia para defender o
número de pontos de resistência do dano recebido.
• Mago: pode usar o método bolaDeFogo ao invés de atacar. O mago
gasta 10 pontos de Magia e ataca com a inteligência mulUplicada por um
valor aleatório entre 1 e 20.
• Ladino: Causa o dobro de dano, mas recebe o dobro de dano.
Não esqueça de criar os métodos básicos de orientação a objetos como geters, seters
e o construtor.
Proponha métodos novos para locomoção do personagem ou ataques e defesas, os
métodos sugeridos não são o suficiente para passar na aventura.
Todos os métodos devem ser testados no método main, apresentando seus
funcionamentos completos."
