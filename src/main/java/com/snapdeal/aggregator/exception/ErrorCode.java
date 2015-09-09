package com.snapdeal.aggregator.exception;

public class ErrorCode {

    final private String stringId;
    final private String code;

    public ErrorCode(String stringId, String code) {
        this.stringId = stringId;
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    
    public String getStringId() {
		return stringId;
	}

	public final static ErrorCode INTERNAL_ERROR = new ErrorCode("stringId", "InternalError");
}
