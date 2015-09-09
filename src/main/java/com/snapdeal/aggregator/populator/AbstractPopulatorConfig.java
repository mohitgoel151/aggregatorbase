package com.snapdeal.aggregator.populator;

import org.apache.commons.lang3.StringUtils;

import com.snapdeal.aggregator.exception.PopulatorConfigFileMissingException;
import com.snapdeal.aggregator.exception.PopulatorConfigFileParseException;

public abstract class AbstractPopulatorConfig implements PopulatorConfig {
	
	public abstract String getFilePath(); 
	
	protected void loadConfigFile() throws PopulatorConfigFileMissingException, PopulatorConfigFileParseException {

		if(StringUtils.isBlank(getFilePath())) {
			throw new PopulatorConfigFileMissingException("Invalid config file name");
		}
		
		parseConfigFile();
		validateConfigFile();
	}
	
	private void parseConfigFile() throws PopulatorConfigFileParseException {
		
		//new PopulatorConfigFileParseException("Exception occurred while parsing config file");
	}
	
	private void validateConfigFile() throws PopulatorConfigFileParseException {
		
		////new PopulatorConfigFileParseException("Exception occurred while validating config file");
	}
	
	public Populator getPopulateDependency(String populator) {
		return null;
		// TODO Auto-generated method stub
		
	}

}
