package com.snapdeal.aggregator.populator;

import org.apache.log4j.Logger;

import com.snapdeal.aggregator.exception.AggregatorException;
import com.snapdeal.aggregator.model.RequestAccessor;
import com.snapdeal.aggregator.model.ResponseAccessor;

public abstract class AbstractPopulator implements Populator { 
	
    private static Logger log = Logger.getLogger(AbstractPopulator.class); 

    private String tag;
    protected RequestAccessor request;
    protected ResponseAccessor response;
    
    /**
     * Returns the request object
     * @return The request
     */
    public RequestAccessor getRequest() {
        return request;
    }
       
    public void setTag(String tag){ 
    	this.tag = tag; 
    }
    
    public String getTag() {
        if(tag == null)
            tag = getClass().getSimpleName();
        return tag;
    }
    
    public AbstractPopulator() {
        
    }
    
    public void populate(RequestAccessor aRequest, ResponseAccessor aResponse) throws AggregatorException {

        this.request = aRequest;
        this.response = aResponse;
        populate();
    }

    protected abstract void populate() throws AggregatorException;

}

