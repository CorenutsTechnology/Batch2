package com.crnt.test.nov;

import java.lang.constant.Constable;
import java.util.Scanner;

import Interface_Collection.Constructor_Chenning;

public class Student_23 implements Constructor_Chenning {
 public String name;
 Student_23(){
	 name="unknown";
	 System.out.println(name);
 }
 Student_23(String name){
	 this.name=name;
	 System.out.println(name);
	 
 }
 public static void main(String[] args) {
	 Student_23 student_23=new Student_23(); 
	 Student_23 student_23_1=new Student_23("name");
	 
}
}
