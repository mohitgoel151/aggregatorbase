package com.snapdeal.aggregator.populator;

import org.apache.log4j.Logger;

public class PopulatorFactory {
    protected static Logger log = Logger.getLogger(PopulatorFactory.class);
    
    public static Populator createPopulator (String tag) {
        Populator populator = null;
        
        try {
            populator = (Populator) PopulatorConfigurationTemp.getPopulatorImplementation(tag).newInstance();
        } catch (Exception ex) {
            log.fatal(ex);
            throw (new RuntimeException("Failed in Creating Populator: " + tag));
        }
        
        if (populator != null)
            populator.setTag(tag);
        
        return populator;
    }
}
