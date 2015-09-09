package com.snapdeal.aggregator.populator;

import java.util.ArrayList;
import java.util.List;

import com.snapdeal.aggregator.exception.AggregatorException;

public class PopulatorData {
    private Class<?> implementation;
    private List<String> dependencies = new ArrayList<String>();

    public PopulatorData(String implementation, List<String> dependencies) throws AggregatorException {
        this.dependencies = dependencies;
        try {
            this.implementation = Class.forName(implementation);
        } catch (Exception ex) {
           //TODO
        	//throw AggregatorException.InternalError(ex);
        }
    }

    public Class<?> getImplementation() {
        return implementation;
    }

    public List<String> getDependencies() {
        return dependencies;
    }
}
