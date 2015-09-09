package com.snapdeal.aggregator.model;

import java.util.UUID;

public class RequestAccessor {
	
	private final String requestId;
	
	public String getRequestId() {
		return requestId;
	}

	public RequestAccessor() {
		this.requestId = UUID.randomUUID().toString();
	}

}
