package selenium.pratica.lead;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Teste {
	
	@Test
	public void abrirChrome() throws InterruptedException {
		File file = new File("/home/jorge/Selenium/driver/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeOptions ChromeOptions = new ChromeOptions();
		ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox", "'--disable-dev-shm-usage'");
		WebDriver driver = new ChromeDriver(ChromeOptions);
		
		driver.get("https://www.devmedia.com.br/");
		String title = driver.getTitle();
		driver.close();
		
		//De acordo com o que é pedido na atividade, o teste dará erro, pois o título da página atualmente é 
		//"DevMedia | Aprenda a Programar do Zero" e não "DevMedia | Plataforma para Programadores"
		assertEquals("DevMedia | Plataforma para Programadores", title);
	}

}
