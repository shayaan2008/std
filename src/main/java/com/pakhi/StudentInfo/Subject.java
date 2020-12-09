package com.pakhi.StudentInfo;

import org.springframework.stereotype.Component;

@Component
public class Subject
{

	
	private String subName;

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Subject is CSC";
	}
	
	
	
}
