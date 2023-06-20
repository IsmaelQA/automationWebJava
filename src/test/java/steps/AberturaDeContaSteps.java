package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Base;
import pages.AberturaDeContaPages;


public class AberturaDeContaSteps {

    AberturaDeContaPages abertura = new AberturaDeContaPages();
    Base base = new Base();

    @Given("que o usuario acessou o site da nubank")
    public void que_o_usuario_acessou_o_site_da_nubank() {

        abertura.preencherCpf();

    }

    @When("preencheu o cpf para abertura de conta")
    public void preencheu_o_cpf_para_abertura_de_conta() {

    }

    @When("clicou em continuar")
    public void clicou_em_continuar() {

    }

    @When("preencheu os dados necessarios")
    public void preencheu_os_dados_necessarios() {

    }

    @When("aceitar as politicas")
    public void aceitar_as_politicas() {

    }

    @When("clicar em enviar")
    public void clicar_em_enviar() {

    }

    @Then("o formulario sera enviado para analise com sucesso")
    public void o_formulario_sera_enviado_para_analise_com_sucesso() {

    }
}
