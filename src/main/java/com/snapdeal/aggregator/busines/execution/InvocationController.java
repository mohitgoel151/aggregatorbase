package com.snapdeal.aggregator.busines.execution;

import org.apache.log4j.Logger;

import com.snapdeal.aggregator.exception.AggregatorException;
import com.snapdeal.aggregator.model.RequestAccessor;
import com.snapdeal.aggregator.model.ResponseAccessor;
import com.snapdeal.aggregator.populator.Populator;
import com.snapdeal.aggregator.populator.PopulatorConfig;

public class InvocationController {
	
    private static Logger log = Logger.getLogger(InvocationController.class);
    private final RequestAccessor request;
    private final ResponseAccessor response;
    private PopulatorConfig config;
    
	public InvocationController(RequestAccessor requestObj, ResponseAccessor responseObj) {
		this.request = requestObj;
		this.response = responseObj;
	}
	
	public Object invoke() throws AggregatorException {
		
		Populator basePopulator = config.getPopulateDependency("");
		//log.
		return new Object();
	}

}
