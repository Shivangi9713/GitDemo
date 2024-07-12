package javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "/Users/saini/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("to");
		List<WebElement> veggies= driver.findElements(By.xpath("//tr//td[1]"));
		List<WebElement> filteredVeg= veggies.stream().filter(s->s.getText().contains("to")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filteredVeg.size());
		filteredVeg.forEach(s->System.out.println(s));
	
	}

}*/
//
driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
driver.manage().window().maximize();	
Thread.sleep(15000);	
driver.findElement(By.id("search-field")).sendKeys("to");	
List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

System.out.println(veggies.size());		
List<WebElement> filteredList = veggies.stream().filter(s->s.getText().toLowerCase().contains("to")).collect(Collectors.toList());				//filteredList.forEach(a->System.out.println(a));	
System.out.println(filteredList.size());	
 filteredList.forEach(a -> System.out.println(a.getText()));
Assert.assertEquals(veggies.size(), filteredList.size());
}}
