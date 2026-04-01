package com.learnautomation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.aventstack.extentreports.utils.FileUtil;
import com.google.common.io.Files;

public class Helper {
	
	
	public static void captureScreenshot(WebDriver driver) {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/" + getCurrentDateTime() + ".png");
		try {
			Files.copy(src, dest);
			System.out.println("Screenshot captured");
			}catch(IOException e) {
			System.out.println("Unable to capture screenshot" +e.getMessage());
					
		}
		}
	
	public static String getCurrentDateTime() {
		SimpleDateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
		}
		}
		
