package com.snapdeal.aggregator.exception;

public class AggregatorException extends Exception {

    private static final Type DEFAULT_TYPE = Type.InternalError;
    private static final ErrorCode DEFAULT_ERROR_CODE = ErrorCode.INTERNAL_ERROR;
    private static final String DEFAULT_ERROR_PARAM_NAME = "message";

    public static enum Type {InternalError, UserError}


    private Type type = Type.InternalError;
    public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	public AggregatorException(String message) {
        super(message);
    }
    
    protected AggregatorException(Throwable cause) {
        super(cause);
    }

    protected AggregatorException(String message, Throwable cause) {
        super(message, cause);
    }
    
	
}
