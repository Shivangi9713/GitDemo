package javastreams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class liveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "/Users/saini/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		driver.findElement(By.xpath("//th[@aria-label='Veg/fruit name: activate to sort column ascending']")).click();
		// capture all webelements into list
		List<WebElement> vegNames = driver.findElements(By.xpath("//tbody//tr//td[1]"));
		// capture text of all webelements into new list
		List<String> originalList = vegNames.stream().map(s -> s.getText()).collect(Collectors.toList());
		// now sort the new original list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		// compare original list vs sorted list
		// Assert.assertEquals(originalList, sortedList);
		Assert.assertTrue(originalList.equals(sortedList));
		// Scan names with get text and get price of Beans
		List<String> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr//td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceVeg(s))
					.collect(Collectors.toList());
			price.forEach(s -> System.out.println(s));
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	private static String getPriceVeg(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
