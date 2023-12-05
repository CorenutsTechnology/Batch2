package com.cnts.throwthrows_20;

public class VoteEligibilty {
	
	public void ageDetails(int age) {
		try {
			if (age<18) {
				throw new CustomException("User must be 18 years or older.");
			}else {
				System.out.println("Access granted");
				
			}
			
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public static void main(String[] args) {
		 VoteEligibilty  voteEligibilty = new  VoteEligibilty();
		 voteEligibilty.ageDetails(20);
		 
		 
		
	}
	
	

}
