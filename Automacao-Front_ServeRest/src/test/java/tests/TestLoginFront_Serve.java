package tests;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class TestLoginFront_Serve {
	
	Metodos met = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	
	@Given("que o usuário está na página de login {string}")
	public void que_o_usuário_está_na_página_de_login(String site) {
		met.abrirNavegador(site);
	
		

	}

	@When("o usuário insere e-mail no campo Digite seu email")
	public void o_usuário_insere_e_mail_no_campo_digite_seu_email() {
			met.escrever("fulanoo@qa.com.br", el.getLoginEmail());
	}

	@When("o usuário insere sua senha no campo Digite sua senha")
	public void o_usuário_insere_sua_senha_no_campo_digite_sua_senha() {
			met.escrever("teste", el.getLoginSenha());
	}

	@When("o usuário clica no botão Entrar")
	public void o_usuário_clica_no_botão_entrar() {
			met.clicar(el.getBtnEntrar());
			met.esperar(1000);
	}

	@Then("o usuário deve ser redirecionado para a página inicial")
	public void o_usuário_deve_ser_redirecionado_para_a_página_inicial() {
		met.captureScreenshot("Evidência 01 Login - Usuário redirecionado para a página inicial - " );
		met.fecharNavegador();
		
	}

	@When("o usuário insere seu e-mail no campo Digite seu email")
	public void o_usuário_insere_seu_e_mail_no_campo_digite_seu_email() {
		met.escrever("fulanoo@qa.com.br", el.getLoginEmail());
		met.esperar(1000);
	}

	@When("o usuário insere senha incorreta no campo Digite sua senha")
	public void o_usuário_insere_senha_incorreta_no_campo_digite_sua_senha() {
		met.escrever("sdkjfklsdfs", el.getLoginSenha());
	}

	@Then("o usuário deve ver a mensagem de erro Email e\\/ou senha inválidos")
	public void o_usuário_deve_ver_a_mensagem_de_erro_email_e_ou_senha_inválidos() {
		met.clicar(el.getBtnEntrar());
		met.esperar(1000);
		met.captureScreenshot("Evidência 02 Login - A mensagem de erro é exibida para o usuário - " );
		met.fecharNavegador();
	}

	@When("o usuário insere o seguinte e-mail naoRegistrado@exemplo.com no campo Digite seu email")
	public void o_usuário_insere_o_seguinte_e_mail_nao_registrado_exemplo_com_no_campo_digite_seu_email() {
		met.escrever("naoRegistrado@exemplo.com", el.getLoginEmail());
	}

	@When("o usuário insere a senha no campo Digite sua senha")
	public void o_usuário_insere_a_senha_no_campo_digite_sua_senha() {
		met.escrever("teste", el.getLoginSenha());
		met.clicar(el.getBtnEntrar());
		met.esperar(1000);
		met.captureScreenshot("Evidência 03 Login - A mensagem de erro é exibida para o usuário - " );
		met.fecharNavegador();
	}
	

	@When("o usuário clica no botão Cadastre-se")
	public void o_usuário_clica_no_botão_cadastre_se() {
		met.clicar(el.getBtnCadastraSe());
	}

	@Then("o usuário deve ser redirecionado para a página de cadastro")
	public void o_usuário_deve_ser_redirecionado_para_a_página_de_cadastro() {
		met.captureScreenshot("Evidência 04 Login - Usuário redirecionado para tela de cadastro - " );
		met.fecharNavegador();
	}

}
