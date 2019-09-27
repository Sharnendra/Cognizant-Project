package com.service.demoservicearchitechture.config;

public class Service {
	@Override
	public String toString() {
		return "service [data=" + data + "]";
	}

	public DataCofig getData() {
		return data;
	}

	public void setData(DataCofig data) {
		this.data = data;
	}

	private DataCofig data;
}
