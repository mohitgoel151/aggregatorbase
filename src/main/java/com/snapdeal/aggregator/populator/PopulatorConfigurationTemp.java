package com.snapdeal.aggregator.populator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.snapdeal.aggregator.exception.AggregatorException;

/**
 * @author mohit
 *
 */
public class PopulatorConfigurationTemp {

	protected static Logger log = Logger.getLogger(PopulatorConfigurationTemp.class);

    private static Map<String, PopulatorData> configuration = new HashMap<String, PopulatorData>();

    static {
        try {
            init();
        } catch (AggregatorException ex) {
            log.fatal(ex);
            throw (new RuntimeException("Failed in Initializing Populator Configuration"));
        }
    }

    private static void init() throws AggregatorException {
        // Populator Configuration

//        //ASIN Populator
//        PopulatorData asinPopulator = new PopulatorData(ASINPopulator.class.getName(),
//            new ArrayList<String>());
//        configuration.put("ASINPopulator", asinPopulator);
//
//        //Title Populator
//        ArrayList<String> titlePopulatorDependencies = new ArrayList<String>();
//        titlePopulatorDependencies.add("/ItemLookupResponse/Items/Item/Accessories/Accessory/ASIN");
//        titlePopulatorDependencies.add("/ItemLookupResponse/Items/Item/SimilarProducts/SimilarProduct/ASIN");
//        titlePopulatorDependencies.add("/ItemSearchResponse/Items/Item/Accessories/Accessory/ASIN");
//        titlePopulatorDependencies.add("/ItemSearchResponse/Items/Item/SimilarProducts/SimilarProduct/ASIN");
//        titlePopulatorDependencies.add("/SimilarityLookupResponse/Items/Item/Accessories/Accessory/ASIN");
//        titlePopulatorDependencies.add("/SimilarityLookupResponse/Items/Item/SimilarProducts/SimilarProduct/ASIN");
//        PopulatorData titlePopulator = new PopulatorData(TitlePopulator.class.getName(),
//            titlePopulatorDependencies);
//        configuration.put("TitlePopulator", titlePopulator);
//
// 
    }

    public static Class<?> getPopulatorImplementation(String populatorTag) {
        return configuration.get(populatorTag).getImplementation();
    }

    public static List<String> getPopulatorDependencies(String populatorTag) {
        return configuration.get(populatorTag).getDependencies();
    }

    public static Set<String> getPopulators() {
        return configuration.keySet();
    }

}

