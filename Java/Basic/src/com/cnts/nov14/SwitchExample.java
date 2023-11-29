package com.cnts.nov14;

public class SwitchExample 
{
    public static void main(String[] args)
    {
        int[] cases = {1, 2, 3, 4, 5};

        for (int caseValue : cases) 
        {
            switch (caseValue) 
            {
                case 1:
                    System.out.println("Case 1: This is the first case.");
                    break;
                case 2:
                    System.out.println("Case 2: This is the second case.");
                    break;
                case 3:
                    System.out.println("Case 3: This is the third case.");
                    break;
                case 4:
                    System.out.println("Case 4: This is the fourth case.");
                    break;
                case 5:
                    System.out.println("Case 5: This is the fifth case.");
                    break;
                default:
                    System.out.println("Default case: This is the default case.");
            }
        }

        System.out.println("Testing without breaks:");

        for (int caseValue : cases)
        {
            switch (caseValue)
            {
                case 1:
                    System.out.print("Case 1 ");
                case 2:
                    System.out.print("Case 2 ");
                case 3:
                    System.out.print("Case 3 ");
                case 4:
                    System.out.print("Case 4 ");
                case 5:
                    System.out.print("Case 5 ");
                default:
                    System.out.println("Default case");
            }
        }
    }
}







