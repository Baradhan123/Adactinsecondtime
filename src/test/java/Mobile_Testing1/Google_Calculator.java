package Mobile_Testing1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Google_Calculator {
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.1.2 N2G47H");
		capabilities.setCapability("udid", "3761319a7ce5");
		capabilities.setCapability("deviceName", "Baradhan");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AndroidDriver(url, capabilities);
		//String currentPackage = driver.getCurrentPackage();
		//System.out.println(currentPackage);
		//System.out.println(driver.currentActivity());
		System.out.println("success");
		WebElement pi = driver.findElement(By.id("com.google.android.calculator:id/const_pi")
				);
		pi.click();
		WebElement multiply = driver.findElement(By.id("com.google.android.calculator:id/op_mul")
				);
		multiply.click();
		WebElement num1 = driver.findElement(By.id("com.google.android.calculator:id/digit_5")
				);
		num1.click();
		WebElement mul2 = driver.findElement(By.id("com.google.android.calculator:id/op_mul")
				);
		mul2.click();
		WebElement num2 = driver.findElement(By.id("com.google.android.calculator:id/digit_5")
				);
		num2.click();
		WebElement equals = driver.findElement(By.id("com.google.android.calculator:id/eq")
				);
		
		equals.click();
		WebElement result = driver.findElement(By.id("com.google.android.calculator:id/formula")
				);
		String text = result.getText();
		System.out.println(text);
		
		System.out.println("success");

		
		/*WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"
				+ ""));
		WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"
				+ ""));
		WebElement nine = driver.findElement(By.id("com.google.android.calculator:id/digit_9"
				+ ""));
		WebElement equalto = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]"
				+ ""));
		seven.click();
		System.out.println("success");
		plus.click();
		System.out.println("success");
		nine.click();
		System.out.println("success");
		equalto.click();
		System.out.println("success");*/

		
	}

}
