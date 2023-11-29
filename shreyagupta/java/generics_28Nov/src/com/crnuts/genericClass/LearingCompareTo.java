package com.crnuts.genericClass;

public class LearingCompareTo {
	
	public static void main(String[] args) {
		Integer[] iobj= {5,8,6,11,21};
		String[] sobj= {"java","sql","html","css"};
		Character[] cobj= {'g','i','r','q'};
		
		System.out.println("Sorted Integer Array: " );
		sortGeneric(iobj);
		
		System.out.println("Sorted String Array: " );
		sortGeneric(sobj);
		
		System.out.println("Sorted Character Array: " );
		sortGeneric(cobj);
		
	}
	
	public static <T> void swap(int i,int j,T[] a) {
		T t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	public static <T extends Comparable<T>> void sortGeneric(T[] a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					swap(j,j+1,a);
				}
			}
		}
		for(T t:a) {
			System.out.print(t+", ");
		}
		System.out.println("\n");
	}

}
