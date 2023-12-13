package com.feuji28nov;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
		   abstract void draw();
		}
		class Circle extends Shape{
		   void draw(){
		        System.out.println("drawing circle");
		   }
		}
		class GenericTest{
		   public void drawShapes(List<? extends Shape> lists){
		       for(Shape s:lists){
		           s.draw();
		       }
		}

		public static void main(String args[]){
		   List<Circle> list=new ArrayList<Circle>();
		   list.add(new Circle());
		   list.add(new Circle());
		   GenericTest test=new GenericTest();
		   test.drawShapes(list);
		   }
		}
