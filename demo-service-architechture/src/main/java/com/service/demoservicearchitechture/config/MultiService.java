package com.service.demoservicearchitechture.config;

import java.util.ArrayList;
import java.util.List;

public class MultiService {
	@Override
	public String toString() {
		return "service2 [data2=" + data2 + "]";
	}

	public List<DataCofig> getData2() {
		return data2;
	}

	public void setData2(List<DataCofig> data2) {
		this.data2 = data2;
	}

	private List<DataCofig> data2=new ArrayList<>();
}
