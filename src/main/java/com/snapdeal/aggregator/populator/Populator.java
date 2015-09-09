package com.snapdeal.aggregator.populator;

import com.snapdeal.aggregator.exception.AggregatorException;
import com.snapdeal.aggregator.model.RequestAccessor;
import com.snapdeal.aggregator.model.ResponseAccessor;

public interface Populator {

	public void setTag(String tag);
    public String getTag();
    public RequestAccessor getRequest();
    
    /**
     * Populate the nodes supplied.
     */
    public void populate(RequestAccessor request, ResponseAccessor response) throws AggregatorException;

}