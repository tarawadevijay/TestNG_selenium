package genericLibrary;
import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.ITestResult;

public class TakeScreemshotWebdriver {

	public static void takesScreenshot(WebDriver driver,ITestResult result) {
		LocalDateTime localDateTime = LocalDateTime.now();
		String ldt=localDateTime.toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File ("./errorsh/"+result.getMethod().getMethodName()+ldt+".png");
		tempFile.renameTo(destFile);
	}

}
	

 