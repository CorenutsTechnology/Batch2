//using array
package com.crnts.logout;


import java.util.Scanner;

import com.crnts.Classes.simpleInterest;

public class UserPage  {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws customException {
		UserPage userPage=new UserPage();
		String[] nameList=new String[5];
		nameList[0]="Rakhi";
		nameList[1]="Monika";
		nameList[2]="vaishali";
		nameList[3]="shivani";
		System.out.println("Enter the action to do:");
		String response=sc.nextLine();	
		switch(response)
		{
		case "login":userPage.loginTime(nameList);break;
		
		case "logout":userPage.logoutTime(nameList);break;
		default:System.out.println("Enter valid input");
			
		}
		
	}

	public void logoutTime(String[] nameList) 
	{
		
		System.out.println("Enter you id:");
		int id=sc.nextInt();
		boolean found = false;
        for(int index=0;index<nameList.length;index++)
          
        	if((id == index) )
        	{ System.out.println("Name: " + nameList[index]);
            found = true;
            System.out.println(nameList[index]+"'s Logout time is "+java.time.LocalDateTime.now());
            break;
        }
         

        if (!found) {
        	throw new customException("ID not present");
        }
	}
	public void loginTime(String[] nameList)
	{
		
		System.out.println("Enter you id:");
		int id=sc.nextInt();
		boolean found = false;
        for(int index=0;index<nameList.length;index++)
        {    
        	if((id == index) )
        	{ System.out.println("Name: " + nameList[index]);
            found = true;
            System.out.println(nameList[index]+"'s Login time is "+java.time.LocalDateTime.now());
            break;
        }
         }

        if (!found) {
            System.out.println("ID not found in the list.");
        }
	}

}
