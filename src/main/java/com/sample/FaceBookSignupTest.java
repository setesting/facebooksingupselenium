package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSignupTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver webdriver = null;
		webdriver = new ChromeDriver();

		try {
			loadfaceBook(webdriver);
			//signin(webdriver);
			createNewAccount(webdriver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createNewAccount(WebDriver webdriver) throws InterruptedException {
		WebElement createAccount = webdriver.findElement(By.linkText("Create New Account"));
		createAccount.click();
		Thread.sleep(3000);
		WebElement firstName = webdriver.findElement(By.name("firstname"));
		WebElement secondName = webdriver.findElement(By.name("lastname"));
		WebElement regEmail = webdriver.findElement(By.name("reg_email__"));
		
		
		firstName.sendKeys("firstName");
        secondName.sendKeys("secopndName");
        regEmail.sendKeys("test@gmail.com");
	}

	private static void signin(WebDriver webdriver) throws InterruptedException {

		WebElement username = webdriver.findElement(By.id("email"));
		WebElement password = webdriver.findElement(By.id("pass"));
		WebElement Login = webdriver.findElement(By.name("login"));
		username.sendKeys("test@gmail.com");
		password.sendKeys("test@2");
		Login.click();
		Thread.sleep(3000);
		webdriver.close();
//			    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			    WebElement navigationclick = webdriver.findElement(By.id("logoutMenu"));
//			    WebElement logout = webdriver.findElement(By.xpath("//div[@id='u_d_1']/div/div/div/div/div/ul/li[12]/a/span/span"));
//			    navigationclick.click();
//			    if(logout.isEnabled() && logout.isDisplayed()) {
//			        logout.click();
//			    }
//			    else {
//			        System.out.println("Element not found");
//			    }
		// }
	}

	private static void loadfaceBook(WebDriver webdriver) {
		// Scanner s=new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kchai\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// if("chrome".equals(s.next())) {

		String facebookUrl = "https://www.facebook.com/";
		webdriver.get(facebookUrl);
	}

}
