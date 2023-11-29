package com.crnt.assaignment.nov13;

import java.util.Iterator;

public class CoreNutsPattern {
	public static void main(String[] args) {
		String core="CORENUTS";
		
		for(int index1=0;index1<core.length();index1++)
		{
			for (int index2=0;index2<=index1;index2++)
			{
				System.out.print(core.charAt(index2));
			}
			System.out.println();
		}
	}

}
