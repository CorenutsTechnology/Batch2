package com.crnuts.classtest;

import com.crnuts.classes.User;
import com.crnuts.classes.UserRepository;

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
