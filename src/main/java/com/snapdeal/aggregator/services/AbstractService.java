package com.snapdeal.aggregator.services;

import com.snapdeal.aggregator.exception.AggregatorException;

public interface AbstractService {

    abstract public void doSyncCall() throws AggregatorException;    

}
