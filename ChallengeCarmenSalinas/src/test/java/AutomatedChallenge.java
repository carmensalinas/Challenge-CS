import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomatedChallenge {
	@Test
	public void testRater() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://apprater.net/add/");
		driver.findElement(By.name("user-submitted-name")).sendKeys("Carmen Salinas");
		driver.findElement(By.cssSelector("input[name='user-submitted-email']")).sendKeys("carmen12.salinas@gmail.com");
		driver.findElement(By.xpath("//input[@name='user-submitted-title']")).sendKeys("Producto Prueba");
		driver.findElement(By.name("user-submitted-url[]")).sendKeys("http://www.productoprueba.com/");
		driver.findElement(By.name("user-submitted-content")).sendKeys("Esta es la descripción del producto de prueba.");
	}
}