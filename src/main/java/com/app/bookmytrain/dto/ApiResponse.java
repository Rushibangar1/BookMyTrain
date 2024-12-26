package com.app.bookmytrain.dto;

import java.time.LocalDateTime;


public class ApiResponse {
	private LocalDateTime timeStamp;
	private String message;
	public ApiResponse(String message) {
		super();
		this.message = message;
		this.timeStamp=LocalDateTime.now();
	}


	public ApiResponse() {
		super();
	}

	public ApiResponse(LocalDateTime timeStamp, String message) {
		this.timeStamp = timeStamp;
		this.message = message;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ApiResponse{" +
				"timeStamp=" + timeStamp +
				", message='" + message + '\'' +
				'}';
	}
}
