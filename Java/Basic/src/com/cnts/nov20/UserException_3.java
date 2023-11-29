package com.cnts.nov20;

import java.util.Scanner;

public class UserException_3 extends Exception
{
    public UserException_3(String message) 
    {
        super(message);
    }

    public static void main(String[] args)
    {
        try 
        {
            // code that throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e)
        {
            try 
            {
            	
                throw new UserException_3("User Exception: Division by 0 is not allowed");
            } 
            catch (UserException_3 customException)
            {
                // Handling the custom exception
                System.out.println(customException.getMessage());
            }
        }
    }

    public static int divide(int numerator, int denominator) 
    		throws ArithmeticException {
        return numerator / denominator;
    }
}

