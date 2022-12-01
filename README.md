# Atividade II - POO:
Atividade da cadeira de programação orientada a objetos.

## Projeto
O projeto Agenda tem como funcionalidade principal criar uma agenda de contatos.
Para tanto é necessário implementar o projeto com duas classes base: Agenda e
Contato. A classe agenda é responsável por todas as funcionalidades da agenda e a
classe Contato, responsável pelas informações de cada contato.

## Classe Agenda
Classe que possui todas as funcionalidades da agenda e armazena os contatos.
Nela os contatos são armazenados em uma ArrayList (Collection), onde cada
contato é um elemento da mesma. <br>
Atributos: contatos (ArrayList de Contatos) que armazena os contatos; count (int)
armazena a quantidade de registros na agenda.

Construtor: inicializa os atributos 

Adiciona : recebe como parâmetro um objeto do tipo Contato e o adiciona agenda. 

Remove: recebe como parâmetro a chave do contato e remove o contato da agenda. <br>
Retorna true se exclusão bem sucedida, caso contrário false. 

Busca : Faz a busca de um contato pelo nome ou pelo telefone ou pelo e-mail e <br>
retorna o objeto Contato; 

Exibe: exibe um contato específico ou todos os contatos. 

Encapsular todos os atributos da classe (criar os métodos set e get).

### Classe Contato
Classe que representa um contato da agenda. Necessita os seguintes atributos:

ID (int): identificador do contato <br>
Nome (String): nome do contato (obrigatório) <br>
Telefone (String): telefone do contato (obrigatório) <br> 
E-mail (String): e-mail do contato <br>
Aniversário (String): data de aniversário do contato <br>

Contrutor: inicializa o contato com os valores passados por parâmetro. 
Obrigatoriamente Nome e Telefone.

Todos os atributos devem ser privados e possuírem métodos get e set com
validação dos dados.
