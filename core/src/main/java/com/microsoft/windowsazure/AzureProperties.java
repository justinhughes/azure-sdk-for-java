package com.microsoft.windowsazure;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class AzureProperties
{
	private static String AZURE_PROPERTIES_PATH_ENV_KEY = "AZURE_PROPERTIES";
	private static Properties azureProperties;
	
	public static synchronized String getProperty(String key){
		
		if(azureProperties == null){
			loadProperties();
		}
		
		return azureProperties.getProperty(key);
	}
	
	public static synchronized void setProperty(String key, String value){
		
		if(azureProperties == null){
			loadProperties();
		}
		
		azureProperties.setProperty(key, value);
	}
	
	public static Properties getProperties(){
		if(azureProperties == null){
			loadProperties();
		}
		
		return azureProperties;
	}

	private static void loadProperties(){
		String azurePropertiesPath = System.getenv(AZURE_PROPERTIES_PATH_ENV_KEY);
		azureProperties = new Properties();
		
		if(azurePropertiesPath != null){
			try{
				azureProperties.load(new FileReader(new File(azurePropertiesPath)));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
