package seleniumScripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver;
	
	String url="http://demo.guru.com/v4";
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium Testing\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get(url);;
	}
	
	public void getTitle()
	{
		String titleOfThePage=driver.getTitle();
		
		System.out.println("Title "+titleOfThePage);
		
	}
	
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public static void main(String[] args) {
		WorkingWithChrome wc=new WorkingWithChrome();
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
		
	}
	
	
}
