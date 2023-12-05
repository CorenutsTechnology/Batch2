//using Arraylist
package com.crnts.logout;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Users {
	 static Scanner sc=new Scanner(System.in);
	
			
				
	public static void main(String[] args) {
		
		Users logout=new Users();
		 ArrayList nameList= new ArrayList();
			nameList.add("Rakhi");
			nameList.add("Monika");
			nameList.add("vaishali");
			nameList.add("shivani");
			nameList.add("kalyani");
			nameList.add("Happy");
			System.out.println("Enter the action to do:");
			String response=sc.nextLine();	
			switch(response)
			{
			case "login":logout.loginTime(nameList);break;
			
			case "logout":logout.loginTime(nameList);break;
				
			}
		 }
		
	
	public void logoutTime(ArrayList nameList)
	{
		ListIterator ltr=nameList.listIterator();
		System.out.println("Enter you id:");
		int id=sc.nextInt();
		boolean found = false;
        for(int index=0;index<nameList.size();index++)
        {    String name = (String) ltr.next();
        	if((id == index) )
        	{ System.out.println("Name: " + name);
            found = true;
            System.out.println(name+"'s Login time is "+java.time.LocalDateTime.now());
            break;
        }
        }
        

        if (!found) {
            System.out.println("ID not found in the list.");
        }
	}
	public void loginTime(ArrayList nameList)
	{
		
		ListIterator ltr=nameList.listIterator();
				System.out.println("Enter you id:");
				int id=sc.nextInt();
				
		        boolean found = false;
		        
		        for(int index=0;index<nameList.size();index++)
		        {    String name = (String) ltr.next();
		        	if((id == index) )
		        	{ System.out.println("Name: " + name);
	                found = true;
	                System.out.println(name+"'s Login time is "+java.time.LocalDateTime.now());
	                break;
		        }
		         }
		        if (!found)
		            System.out.println("ID not found in the list.");

		        
		           
		        }
	
	}

