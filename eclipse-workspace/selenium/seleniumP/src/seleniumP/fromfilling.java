package seleniumP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fromfilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver w= new ChromeDriver();
		w.get("https://demo.automationtesting.in/Register.html");
		w.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sridhar");
		w.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Amazon");
		w.findElement(By.xpath("//textarea[@rows='3'] ")).sendKeys("Chennai");
		w.findElement(By.xpath("//input[@type='email']")).sendKeys("sridhar@amazon.com");
		w.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
		w.findElement(By.xpath("//input[@value='Male']")).click();
		w.findElement(By.xpath("//input[@id='checkbox3']")).click();
		Select s= new Select(w.findElement(By.id("Skills")));
		s.selectByVisibleText("Android");
		Select s1= new Select(w.findElement(By.id("yearbox")));
		s1.selectByVisibleText("1926");

	}

}
