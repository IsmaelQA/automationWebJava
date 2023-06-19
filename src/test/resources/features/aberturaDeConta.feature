
@tag
Feature: Abertura de conta
 	Eu como usuario quero informar meu dados para abertura de conta

  
  Scenario: Pedir cartao de credito
    Given que o usuario acessou o site da nubank
    When preencheu o cpf para abertura de conta
    And clicou em continuar
    And preencheu os dados necessarios
    And aceitar as politicas
    And clicar em enviar
    Then o formulario sera enviado para analise com sucesso
  


