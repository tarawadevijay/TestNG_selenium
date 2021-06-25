package Parameterization;

import org.testng.ITestListener;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext ;		
		
import org.testng.ITestResult ;

import genericLibrary.BaseClasss;	

public class ITestListenerImplementation extends BaseClasss implements ITestListener						
{		
public WebDriver driver;
    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
    	LocalDateTime localDateTime = LocalDateTime.now();
		String ldt=localDateTime.toString().replace(":","-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String res = arg0.getMethod().getMethodName();
		File destFile=new File ("./errorshots/"+ldt+res+".png");
		tempFile.renameTo(destFile);
	}			
        		
    	

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
}		
