package tests;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class TestCadastroFront_Serve {

	Metodos met = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que o usuário está na página de cadastro {string}")
	public void que_o_usuário_está_na_página_de_cadastro(String site) {
		met.abrirNavegador(site);
	}

	@When("o usuário insere o seu nome no campo Nome")
	public void o_usuário_insere_o_seu_nome_no_campo_nome() {
		met.escrever("Weslley Rodrigues da Silva", el.getNomeCadastro());
	}

	@When("o usuário insere  o email no campo E-mail")
	public void o_usuário_insere_o_email_no_campo_e_mail() {
		met.escrever("weslley.teste@gmail.com", el.getEmailCadastro());
	}

	@When("o usuário insere sua senha no campo Senha")
	public void o_usuário_insere_sua_senha_no_campo_senha() {
		met.escrever("Teste@123", el.getPassWord());
	}

	@When("o usuário clica no botão Cadastrar")
	public void o_usuário_clica_no_botão_cadastrar() {
		met.clicar(el.getBtnCadastro());
		met.esperar(1000);

	}

	@Then("o usuário deve ver a mensagem Cadastro realizado com sucesso")
	public void o_usuário_deve_ver_a_mensagem_cadastro_realizado_com_sucesso() {
		met.captureScreenshot("Evidência 01 Cadastro - Usuário cadastrado  - ");
		met.fecharNavegador();
	}

	@Then("o usuário deve ver uma mensagem de erro Este email já está sendo usado")
	public void o_usuário_deve_ver_uma_mensagem_de_erro_este_email_já_está_sendo_usado() {
		met.captureScreenshot("Evidênvia 02 Cadastro - Mensagem de erro e-mail ja está sendo usado");
		met.fecharNavegador();
	}

	@When("o usuário insere  o email no formato inválido no campo E-mail")
	public void o_usuário_insere_o_email_no_formato_inválido_no_campo_e_mail() {
		met.escrever("weslley.teste", el.getEmailCadastro());

	}

	@Then("o usuário deve ver uma mensagem de erro")
	public void o_usuário_deve_ver_uma_mensagem_de_erro() {
		met.captureScreenshot("Evidênvia 03 Cadastro - Aviso que o e-mail é obrigatório");
		met.esperar(1000);
		met.fecharNavegador();

	}

	@When("o usuário insere o email no campo E-mail")
	public void o_usuário_insere_o_email_no_campo_e_mail1() {
		met.escrever("weslley.teste.teste@gmail.com", el.getEmailCadastro());
	}

	@When("o usuário insere sua senha fraca no campo Senha")
	public void o_usuário_insere_sua_senha_fraca_no_campo_senha() {
		met.escrever("a", el.getPassWord());
		met.esperar(1000);
	}

	@Then("o usuário deve ver uma mensagem de erro password")
	public void o_usuário_deve_ver_uma_mensagem_de_erro_password() {
		met.captureScreenshot("Evidênvia 04 Cadastro - Uma de senha fraca deve ser exibida - ");
		met.fecharNavegador();
	}

	@When("o usuário não  insere o seu nome no campo Nome")
	public void o_usuário_não_insere_o_seu_nome_no_campo_nome() {
		met.escrever("", el.getNomeCadastro());
	}

	@When("o usuário não  insere o email no campo E-mail")
	public void o_usuário_não_insere_o_email_no_campo_e_mail() {
		met.escrever("", el.getEmailCadastro());
	}

	@When("o usuário não insere sua senha no campo Senha")
	public void o_usuário_não_insere_sua_senha_no_campo_senha() {
		met.escrever("", el.getPassWord());
	}
	
	@Then("o usuário deve ver mensagem de erro dos campos obrigatórios")
	public void o_usuário_deve_ver_mensagem_de_erro_dos_campos_obrigatórios() { 
	   met.clicar(el.getBtnCadastro());
	   met.esperar(1000);
	   met.captureScreenshot("Evidênvia 05 Cadastro - Mensagem de erro dos campos obrigatórios ");
	   met.fecharNavegador();
	   
	}
	
}
