package com.snapdeal.aggregator.utils;

public final class Constants {
	
	//Enums
    public static enum ExecutionStatus {Undefined, Succeeded, Failed, Aborted}
    public static enum ProcessStatus { NotStarted, InProgress , Completed }
    
    //String constants
    public static final String REQUEST_ID_MDC_KEY = "requestId";

}
