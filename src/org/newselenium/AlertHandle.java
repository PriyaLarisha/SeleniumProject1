package org.newselenium;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {
	

		
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Priya\\Documents\\selenium photon workspace\\Selenium\\Driver\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	    
	    driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
	    
	    //simple alert
	    WebElement clickButton = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	    
	    clickButton.click();
	    
	    Alert alert = driver.switchTo().alert();
	    
	    alert.accept();
	    
	    Thread.sleep(3000);
	    
	    //confirm alert
	    
	    WebElement confirmAlert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	    
	    confirmAlert.click();
	    
          WebElement clickButton2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	    
	    clickButton2.click();
	    
	    Alert alert2 = driver.switchTo().alert();
	    
	    alert2.dismiss();
	    
	    Thread.sleep(3000);
	    
	    //prompt alert
	    WebElement promptAlert=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	    
	    promptAlert.click();
	    
	     WebElement clickButton3=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	  
	     clickButton3.click();
	  
	     Alert alert3= driver.switchTo().alert();
	
	     String text=alert3.getText();
	 
	     System.out.println(text);
System.out.println(text);	 
	     alert3.sendKeys("priya");
	 
	     Thread.sleep(3000);
	 
	     alert3.accept();
	 
	
	 
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	      
	    
	    
	    
  
	    
	    
	    
	    
	    
	    
	    
	}

}

