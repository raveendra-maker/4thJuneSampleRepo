package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;
	public ConfigDataProvider()
	{
		File scr=new File("./Config/Config.properties");
		try {
			FileInputStream fis=new FileInputStream(scr);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
			System.out.println("Unable to read config file:" +e.getMessage());
			}
		} 

	
	public String getDataFromConfig(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getStangingURL()
	{
		return pro.getProperty("qaUrl");
	}
}
