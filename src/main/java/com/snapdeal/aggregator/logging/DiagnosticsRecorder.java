package com.snapdeal.aggregator.logging;

public final class DiagnosticsRecorder {
	
	private Timer timer = null;
	private String requestId = "";
	
	public DiagnosticsRecorder() {
		//timer = 
	}
	
	public DiagnosticsRecorder(final String requestId) {
		this.requestId = requestId;
	}
	
	
	
}
