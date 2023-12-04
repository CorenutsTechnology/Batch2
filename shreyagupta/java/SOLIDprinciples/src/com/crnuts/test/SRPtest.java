package com.crnuts.test;

import com.crnuts.entity.User;
import com.crnuts.entity.UserRepository;

public class SRPtest {

	public static void main(String[] args) {
		 
		        
		        User newUser = new User(754,"Rajeg");
		        
		    
		        UserRepository userRepository = new UserRepository();
		        userRepository.saveUser(newUser);
		        
		        System.out.println("adding new User");
		        newUser.setUserId(1);
		        newUser.setUsername("JohnDoe");
		        
		        userRepository.saveUser(newUser);

		        

		      
		        
		    

	}

}
