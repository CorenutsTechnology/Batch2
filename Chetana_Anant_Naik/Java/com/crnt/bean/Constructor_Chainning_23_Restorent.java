package com.crnt.bean;

public class Constructor_Chainning_23_Restorent extends SuperStatement {
	String hotel_name;
	String place;
	
	Constructor_Chainning_23_Restorent(String hotel_name,String place){
		this("PIZZA",8765.00);
		this.hotel_name=hotel_name;
		this.place=hotel_name;
		System.out.println("this hotel is "+hotel_name+" in "+place);
		
	}
    Constructor_Chainning_23_Restorent(char Y){
      super('A');
    System.out.println("SEARCH SOME HOTEL");
     
	
	}
    
    Constructor_Chainning_23_Restorent(String menu,double cost){
    	this('Y');
    	System.out.println("your "+menu +"ready thats only "+cost+"Rs");  
    }
    Constructor_Chainning_23_Restorent(String welcom){
    	this("UDUPI HOTEL","WHITEFIELD");
    	System.out.println("welcome to us house");
    }
    
public static void main(String[] args) {
	Constructor_Chainning_23_Restorent chainning_23=new Constructor_Chainning_23_Restorent("serach hotel");
}
}
 class SuperStatement {
	String hotel_name;
	String place;
	
	SuperStatement(String hotel_name,String place){
		this("PIZZA",8765.00);
		this.hotel_name=hotel_name;
		this.place=hotel_name;
		System.out.println("this hotel is "+hotel_name+" in "+place);
		
	}
	SuperStatement(char Y){
 
    System.out.println("SEARCH SOME HOTEL"); 
	
	}
    
	SuperStatement(String menu,double cost){
    	this('Y');
    	System.out.println("your "+menu +"ready thats only "+cost+"Rs");  
    }
	SuperStatement(String welcom){
    	this("UDUPI HOTEL","WHITEFIELD");
    	System.out.println("welcome to us house");
    }
    
}