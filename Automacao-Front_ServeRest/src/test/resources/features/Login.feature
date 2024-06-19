#Author: weslleyrds20@gmail.com

@Login
Feature: Tela de Login
  Eu como usuário vou validar a tela de login do site front.serverest.dev
  
  Background: site
  	Given que o usuário está na página de login "https://front.serverest.dev/login"
  
  @CT01Login
  Scenario Outline: Usuário faz login com sucesso
  	When o usuário insere e-mail no campo Digite seu email
  	And o usuário insere sua senha no campo Digite sua senha
  	And o usuário clica no botão Entrar
  	Then o usuário deve ser redirecionado para a página inicial 
   
  @CT02Login
  Scenario: Usuário tenta fazer login com senha incorreta
  	When o usuário insere seu e-mail no campo Digite seu email
  	And o usuário insere senha incorreta no campo Digite sua senha
  	And o usuário clica no botão Entrar
  	Then o usuário deve ver a mensagem de erro Email e/ou senha inválidos
 
  @CT03Login
  Scenario: Usuário tenta fazer login com e-mail não registrado
  	When o usuário insere o seguinte e-mail naoRegistrado@exemplo.com no campo Digite seu email
  	And o usuário insere a senha no campo Digite sua senha
  	And o usuário clica no botão Entrar
  	Then o usuário deve ver a mensagem de erro Email e/ou senha inválidos
  	
  	@CT04Login
  Scenario: Usuário acessa a página de cadastro
  	When o usuário clica no botão Cadastre-se
  	Then o usuário deve ser redirecionado para a página de cadastro
    