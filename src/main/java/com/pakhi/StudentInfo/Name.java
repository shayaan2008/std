package com.pakhi.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Name implements Student
{
	@Autowired
	private Subject subject;
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public void std()
	{
		System.out.println("Masud " + subject);
	}
}
