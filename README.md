# bancoApp

Um banco implantou um sistema para controlar o acesso dos clientes aos caixas. Cada cliente, ao chegar, registra-se no sistemas, informando seu nome e sua idade. Os caixas, quando liberados, solicitam ao sistema o próximo cliente. O sistema está projetado para dar prioridade a clientes idosos, da seguinte forma:

  -Os caixas de 1 a 5 deverão dar prioridade aos clientes com 65 anos ou mais. Assim, se houver clientes desta faixa etária, aquele que tiver chegado há mais tempo deve ser selecionado. Caso não haja, seleciona o cliente (de qualquer idade) que está a espera;
  
  -Os caixas de 6 em diante devem selecionar o cliente que está há mais tempo a espera, seja ele de que idade for;
  
Implemente este sistema. A interface com o usuário deve oferecer duas opções: uma para o caixa solicitar o próximo cliente (que será selecionado de acordo com as regras de prioridade), e uma para o cliente se registrar quando chega ao banco. Esta interface pode ser gráfica ou textual (de preferência, gráfica, para praticar). 
