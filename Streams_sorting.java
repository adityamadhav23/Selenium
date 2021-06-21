package introduction;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streams_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\programmes\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr//th[1]//span")).click();
		List<WebElement> names=driver.findElements(By.xpath("//tr//td[1]"));
		//collecting original list
		List<String> originalList=names.stream().map(s->s.getText()).collect(Collectors.toList());
		//Sorting the original list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
	}

}
