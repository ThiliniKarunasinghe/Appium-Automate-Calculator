package Demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
public class APKInstall {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		// TODO Auto-generated method stub
		
		

			//Gather Desired capabilities
			//edited
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appium:deviceName", "HUAWEI FLA-LX2");
            capabilities.setCapability("appium:automationName", "uiautomator2");
            capabilities.setCapability("appium:app", "C:\\Users\\USER\\testapk\\calculator.apk");
            capabilities.setCapability("appium:platformVersion", "9");
		        
		       

		        URL url = URI.create("http://127.0.0.1:4723/").toURL();
		        
		        AndroidDriver driver = new AndroidDriver(url, capabilities);
		       
		        Thread.sleep(5000);
		        System.out.println("Application Started");
		        driver.quit();//CLOSE SESSION
		        
			
		}

	}



