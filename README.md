# Enunciado do trabalho
# Etapa 1
Uma empresa pública possui  um conjunto de funcionários de dois tipos: concursados e temporários. Para cada funcionário,independentemente do tipo,sabe-se o seu salário - base.Além disso,para cada funcionário concursado,sabe-se o número de anos decorridos desde a sua contratação,enquanto,para cada funcionário temporário,o número de meses total do  período do seu contrato.   
No fim  de cada mês,a empresa emite um contracheque para cada funcionário,contendo o valor total recebido naquele mês.O valor mensal é dado pela soma do salário - base e da gratificação.A gratificação de um funcionário concursado é determinada pelo tempo de contratação: ele recebe uma gratificação mensal de R$200,00 para cada ano de contratação.A de um funcionário temporário é determinada pelo período total do seu contrato: ele recebe uma gratificação mensal de R$15,00 para cada mês de contrato.Implemente uma classe na linguagem Java,denominada FolhaPagamento,que contenha apenas o método main,com os seguintes passos:  
Lê os dados de n (entre 1 e 100) funcionários fornecidos pela entrada padrão (teclado).
Calcula o valor mensal recebido por cada funcionário.
Imprime na saída padrão (tela) a relação de n funcionários com os correspondentes valores mensais recebidos, apresentando primeiramente todos os concursados e,em seguida,os temporários.
Para cada funcionário, devem ser fornecidos os seguintes dados:  
Código: um valor inteiro (int). 
Tipo: o valor (int) 1 para funcionário concursado ou o valor 2 para funcionário temporário. 
Salário-base: um valor real (double). 
Tempo: um valor inteiro (int) correspondente ao número de anos de contratação para funcionário concursado ou ao número de meses do período de contrato para um funcionário temporário. 
  Por exemplo, considerando  o seguinte conjunto de n = 3 funcionários :  
Funcionário com código 147, concursado (1), com salário-base de R$ 4.000,00 e 5 anos de contratação. 
Funcionário com código 304, temporário (2), com salário-base de R$ 1.500,00 e 24 meses de contrato. 
Funcionário com código 214, concursado (1), com salário-base de R$ 7.200,00 e 10 anos de contratação. 
  Os correspondentes dados de entrada possuem o seguinte formato , sendo  o primeiro  dado   o valor de n :  
  3  
147  
1  
4000.00  
5  
304  
2  
1500.00  
24  
214  
1  
7200.00  
10  
A  saída impressa correspondente  é :  
Concursados:  
147: 5000.00  
214: 9200.00  
Temporários:  
304: 1860.00  
 
Você construir á um programa que realiza as três etapas típicas,a saber : entrada, processa mento e saída de dados,utilizando comandos sequenciais de uma linguagem de programação orientada a objetos, com expressões, repetição e decisão, e dados estruturados para armazenamento em memória.Ao final, saberá codificar programas baseados em sequências de comandos imperativos e expressões sobre dados de tipos primitivos e estruturas de dados.Para tanto, deverá considerar  os comandos de definição de variáveis simples e estruturadas (vetores e matrizes), sintaxe para definição de expressões algébricas, comando de desvio, comando de repetição, comando para leitura de dados e comando para impressão de dados. 
#Etapa 2
Reimplemente o programa feito na  e tapa 1 ,  de forma a representar os dois tipos de funcionário por meio de classes específicas, denominadas  FuncionarioConcursado  e  FuncionarioTemporario .   
Cada uma dessas classes deverá  definir  atributos e métodos de acordo com as características do tipo de funcionário que representa. Assim, a classe  FuncionarioConcursado  deverá conter atributos que representem o código do funcionário, seu salário - base, o número de anos de contratação e o valor mensal recebido, enquanto a classe  FuncionarioTemporario   deverá conter  atributos que represent e m o código do funcionário, seu salário - base, o número de meses do contrato e o valor mensal recebido.   
A classe  FolhaPagamento  continuará existind o, porém  passará a fazer uso das  novas  classes para o armazenamento ,   o processamento e a impressão  dos  dados , isto é, deverá criar  objetos  dessas classes para representar os funcionários da empresa (um objeto para cada funcionário).    
C ada uma das novas classes dev erá ter um método construtor,  um método que calcul e  o atributo correspondente ao v a lor mensal recebido pelo funcionário  e um método que imprim a  os dados do funcionário (código e valor mensal recebido) . Esses métodos deverão ser chamados a partir do método  main  da classe  FolhaPagamento .    
O conjunto de funcionários deverá ser representado por meio de dois atributos estáticos  da classe  FolhaPagamento , cada  qual  correspondente a um subconjunto dos funcionários: um atributo para o subconjunto dos funcionários concursados e outro atributo para o subconjunto dos funcionários temporários.  A implementação de cada subconjunto deverá ser feita com uso de alguma classe de biblioteca para armazenam ento de coleção de objetos,  como a classe  ArrayList .  
Você  construirá um programa orientado a objetos, com  o  uso de classes e instanciação des t as. Com isso, aprenderá a codificar classes com atributos e métodos, a criar objetos de uma classe, a codificar a interação entre objetos por meio de invocação de métodos, além de codificar operações sobre coleções de objetos.  Fique  atento ao princípio de encapsulamento na implementação das classes.
