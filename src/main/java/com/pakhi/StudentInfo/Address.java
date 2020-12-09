package com.pakhi.StudentInfo;

import org.springframework.stereotype.Component;

@Component
public class Address implements Student
{
	private String add;



	@Override
	public String toString() {
		return "queens ny";
	}



	public String getAdd() {
		return add;
	}



	public void setAdd(String add) {
		this.add = add;
	}



	public void std()
	{
		System.out.println("queens ");
	}

}
