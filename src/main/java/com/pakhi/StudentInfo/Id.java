package com.pakhi.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Id implements Student
{
	@Autowired
	private Address add;
	



	public Address getAdd() {
		return add;
	}




	public void setAdd(Address add) {
		this.add = add;
	}




	public void std()
	{
		System.out.println("99 " + add);
		
	}
	
}
