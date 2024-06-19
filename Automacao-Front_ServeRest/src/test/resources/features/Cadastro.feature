#Author: weslleyrds20@gmail.com

@Cadastro
Feature: Tela de Cadastro
  Eu como usuário vou validar a tela de cadastro do site front.serverest.dev
  
  Background: site
  	Given que o usuário está na página de cadastro "https://front.serverest.dev/cadastrarusuarios"


  @CT01Cadastro
  Scenario Outline:  Usuário se cadastra com sucesso
		When o usuário insere o seu nome no campo Nome 
		And o usuário insere  o email no campo E-mail
		And o usuário insere sua senha no campo Senha
		And o usuário clica no botão Cadastrar
		Then o usuário deve ver a mensagem Cadastro realizado com sucesso
		
		
 @CT02Cadastro
  Scenario:  Usuário tenta se cadastrar com e-mail já registrado
  	When o usuário insere o seu nome no campo Nome 
		And o usuário insere  o email no campo E-mail
		And o usuário insere sua senha no campo Senha 
		And o usuário clica no botão Cadastrar 
		Then o usuário deve ver uma mensagem de erro Este email já está sendo usado

@CT03Cadastro
  Scenario: Usuário tenta se cadastrar com e-mail inválido
  	When o usuário insere o seu nome no campo Nome 
		And o usuário insere  o email no formato inválido no campo E-mail
		And o usuário insere sua senha no campo Senha 
		And o usuário clica no botão Cadastrar 
		Then o usuário deve ver uma mensagem de erro 
		
@CT04Cadastro
  Scenario: Usuário tenta se cadastrar com senha fraca
  	When o usuário insere o seu nome no campo Nome 
		And o usuário insere o email no campo E-mail
		And o usuário insere sua senha fraca no campo Senha 
		And o usuário clica no botão Cadastrar 
		Then o usuário deve ver uma mensagem de erro password
		
@CT05Cadastro
  Scenario: Usuário tenta se cadastrar com campos obrigatórios vazios
  	When o usuário não  insere o seu nome no campo Nome 
		And o usuário não  insere o email no campo E-mail
		And o usuário não insere sua senha no campo Senha 
		Then o usuário deve ver mensagem de erro dos campos obrigatórios 
   

   
