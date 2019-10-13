package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomCar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.zoomcar.com/chennai/");

		driver.findElementByLinkText("Start your wonderful journey").click();

		Thread.sleep(3000);

		driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')]").click();

		Thread.sleep(3000);

		driver.findElementByXPath("//button[text()='Next']").click();

		Thread.sleep(3000);

		driver.findElementByXPath("(//div[@class='text'])[2]").click();

		driver.findElementByXPath("//button[text()='Next']").click();

		driver.findElementByXPath("//button[text()='Done']").click();

		List<WebElement> price = driver.findElementsByXPath("//div[@class='price']");
		
		List<Integer> newpriceList = new ArrayList<>();
		
		for (WebElement singleprice : price) {
			String stringPrice = singleprice.getText().replaceAll("\\D", "");
			int intPrice = Integer.parseInt(stringPrice);
			newpriceList.add(intPrice);
		}
		
		Integer min2 = Collections.min(newpriceList);

		String low = min2.toString();
		
		String text = driver.findElementByXPath("(//div[contains(text(), '"+low+"')] / ancestor :: div[@class='car-book'] ) / preceding-sibling :: div[1]/h3").getText();
		
		System.out.println(text);
		
		driver.quit();
		}
	
		//System.out.println(min2);
			/*
		
		//List<WebElement> brand = driver.findElementsByXPath("//div[@class='details']");

		//Map<String, String> set = new LinkedHashMap<>();

		List<String> priceList = new ArrayList<>();

		List<Integer> priceNum = new ArrayList<>();
		
	

		for (int i = 0; i < price.size(); i++) 
		{
			String temp = price.get(i).getText().trim();
			
			if(temp.contains(","))
			{
			temp = temp.replace(",", "");
			}
			priceList.add(temp);
						
			int priceLocal = Integer.parseInt(priceList.get(i));
			
			priceNum.add(priceLocal);
			
			//brandList.add(brand.get(i).getText().trim());
			//set.put(brandList.get(i), brandList.get(i));
		}

		
		int min = Collections.min(priceNum);
		
		
		
		System.out.println(min);
		
		Thread.sleep(3000);*/
		
		
		

	}


