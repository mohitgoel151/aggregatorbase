package com.snapdeal.aggregator.model;

public class ResponseAccessor {
	
	private final RequestAccessor request;
	
	public RequestAccessor getRequest() {
		return request;
	}

	public ResponseAccessor(RequestAccessor request) {
		this.request = request;
	}

}
