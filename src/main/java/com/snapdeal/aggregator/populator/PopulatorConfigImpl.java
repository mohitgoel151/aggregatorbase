package com.snapdeal.aggregator.populator;

import com.snapdeal.aggregator.exception.PopulatorConfigFileMissingException;
import com.snapdeal.aggregator.exception.PopulatorConfigFileParseException;

public class PopulatorConfigImpl extends AbstractPopulatorConfig {
	
	private static PopulatorConfigImpl populatorConfig = null;
	private static final Object lockObj = new Object();
	private String filePath = "";
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		filePath = filePath;
	}

	public static PopulatorConfigImpl getInstance() throws PopulatorConfigFileMissingException, PopulatorConfigFileParseException {
		
		if(populatorConfig == null) {
			synchronized (lockObj) {
				if(populatorConfig == null) {
					populatorConfig = new PopulatorConfigImpl();
				}
			}
		}
		
		return populatorConfig;
	}
	
	private PopulatorConfigImpl() throws PopulatorConfigFileMissingException, PopulatorConfigFileParseException {
		loadConfigFile();
	}



}
