package pages;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");

		try {

			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();

		} catch (Exception e) {
			System.out.println("------- Erro no metodo ------" + e.getMessage());
			System.out.println("------- Erro do erro   ------" + e.getCause());

		}

	}

	public void fecharNavegador() {

		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro ------" + e.getCause());

		}

	}

	public void captureScreenshot(String texto) {

		{
			try {
				// Captura a hora e data atual
				String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

				// Converte o driver para o tipo TakesScreenshot
				TakesScreenshot ts = (TakesScreenshot) driver;

				// Chama o método getScreenshotAs para criar o arquivo de imagem
				File source = ts.getScreenshotAs(OutputType.FILE);

				// Define o diretório onde você deseja salvar a captura de tela
				String screenshotPath = "src/Evidencia/";

				// Cria o diretório, se não existir
				new File(screenshotPath).mkdirs();

				// Define o nome do arquivo com base no timestamp
				String screenshotName = texto + timeStamp + ".png";
				// Cria o caminho completo para o arquivo de imagem
				String destination = screenshotPath + screenshotName;

				// Copia o arquivo de imagem para o diretório desejado
				FileUtils.copyFile(source, new File(destination));

				System.out.println("Screenshot capturada: " + screenshotName);
			} catch (Exception e) {
				System.out.println("Erro ao capturar a screenshot: " + e.getMessage());
				System.out.println("------- Causa do erro  ------" + e.getCause());
			}
		}

	}
}
