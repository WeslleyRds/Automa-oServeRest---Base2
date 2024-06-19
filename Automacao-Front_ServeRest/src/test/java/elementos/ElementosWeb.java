package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// ElementosWeb Tela de login
	
	By LoginEmail = By.id("email");
	By LoginSenha = By.id("password");
	By BtnEntrar = By.xpath("//button[@data-testid='entrar'][contains(.,'Entrar')]");
	By BtnCadastraSe = By.xpath("//a[@data-testid='cadastrar'][contains(.,'Cadastre-se')]");
	
	public By getLoginEmail() {
		return LoginEmail;
	}
						
	public By getLoginSenha() {
		return LoginSenha;
	}
	
	public By getBtnEntrar() {
		return BtnEntrar;
	}
	 
	public By getBtnCadastraSe() {
		return BtnCadastraSe;
	}
	
	// ElementosWeb tela de Cadastro
	
	By NomeCadastro = By.id("nome");
	By EmailCadastro = By.id("email");
	By PassWord = By.id("password");
	By BtnCadastro = By.xpath("//button[@data-testid='cadastrar'][contains(.,'Cadastrar')]");
	
	public By getNomeCadastro () {
		return NomeCadastro;
	}
	public By getEmailCadastro () {
		return EmailCadastro;
	}
	
	public By getPassWord() {
		return PassWord;
	}
	public By getBtnCadastro() {
		return BtnCadastro;
		
	}
}
