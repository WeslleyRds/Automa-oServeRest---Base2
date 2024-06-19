package pages;



import org.openqa.selenium.By;



public class Metodos extends Navegador {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("----- Erro no metodo -----" + e.getMessage());
			System.out.println("----- Causa do erro ----- " + e.getCause());
		}
	}

	public void escrever(String texto, By elemento) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("----- Erro no metodo -----" + e.getMessage());
			System.out.println("----- Causa do erro ----- " + e.getCause());
		}
	}

	public void esperar(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}

}