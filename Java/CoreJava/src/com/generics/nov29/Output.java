package com.generics.nov29;

public class Output 
{
	public static void main(String args[])
    {
        genericstack <Integer> gs = new genericstack<Integer>();
        gs.push(36);
        System.out.println(gs.pop());
    }
}
