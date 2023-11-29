package com.crnt.test.nov;

import Interface_Collection.UseOfAbstactrion;

public class UseOfAbstactrion_21 {
public static void main(String[] args) {
	IT_job it_job=new IT_job();
	it_job.job();
	it_job.salary();
	
	Non_IT_job non_IT_job=new Non_IT_job();
	non_IT_job.job();
	non_IT_job.salary();
}

}
class IT_job implements UseOfAbstactrion{

	@Override
	public void job() {
		System.out.println("job is hard but in this job we got good future");
		
	}

	@Override
	public void salary() {
		
		System.out.println("based on your experince");
	}
	
}

class Non_IT_job implements UseOfAbstactrion{

	@Override
	public void job() {
		System.out.println("job is easy compare to IT");
		
	}

	@Override
	public void salary() {
		
		System.out.println("-----------------");
	}
	
}

