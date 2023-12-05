package com.cnts.collections_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class CollectionTest {
	
  @Test
  public void arrayToListTest() {
	  Employee[] employees =new Employee[4];
	  employees[0]=new Employee("Swathi",101);
	  employees[1]=new Employee("Bindhu",102);
	  employees[2]=new Employee("Navya",103);
	  employees[3]=new Employee("Keerthi",104);
	  
	  ArrayToList arrayToList = new ArrayToList();
	  arrayToList.arrayToArrayList(employees);
	
	  
	 

	  
	   
  }
  @Test
  public void collectionToArrayTest() {
	  CollectionToArray collectionToArray = new CollectionToArray();
	  collectionToArray.arrayListToCollection();
	  
	  
  }
  @Test
  public void displayTest() {
	  DisplayList displayList = new DisplayList();
	  displayList.displayMethod();
	  displayList.displayUsingIterator();
  }
  
  @Test
  public void MovieTest() {
	  ArrayList<Movie> list = new ArrayList<Movie>();
      list.add(new Movie( 8.3,"Force Awakens", 2015));
      list.add(new Movie( 8.7,"Star Wars", 1977));
      list.add(new Movie( 8.8, "Empire Strikes Back",1980));
      list.add(new Movie( 8.4,"Return of the Jedi", 1983));

      Collections.sort(list);

      System.out.println("Movies after sorting : ");
      for (Movie movie: list)
      {
          System.out.println(movie.getName() + " " +
                             movie.getRating() + " " +
                             movie.getYear());
      }
  }
  
  @Test
  public void comaparatorTest() {
	  ArrayList<Movie> list = new ArrayList<Movie>();
	  list.add(new Movie( 8.3,"Force Awakens", 2015));
      list.add(new Movie( 8.7,"Star Wars", 1977));
      list.add(new Movie( 8.8, "Empire Strikes Back",1980));
      list.add(new Movie( 8.4,"Return of the Jedi", 1983));

      // Sort by rating : (1) Create an object of
      // ratingCompare
      //                  (2) Call Collections.sort
      //                  (3) Print Sorted list
      System.out.println("Sorted by rating");
      RatingCompare ratingCompare = new RatingCompare();
      Collections.sort(list, ratingCompare);
      for (Movie movie : list)
          System.out.println(movie.getRating() + " "
                             + movie.getName() + " "
                             + movie.getYear());
      
      System.out.println("\nSorted by name");
      NameCompare nameCompare = new NameCompare();
      Collections.sort(list, nameCompare);
      for (Movie movie : list)
          System.out.println(movie.getName() + " "
                             + movie.getRating() + " "
                             + movie.getYear());

      // Uses Comparable to sort by year
      System.out.println("\nSorted by year");
      Collections.sort(list);
      for (Movie movie : list)
          System.out.println(movie.getYear() + " "
                             + movie.getRating() + " "
                             + movie.getName() + " ");
  }
  
  @Test
  public void vectorEnumTest() {
	  VectorEnum vectorEnum = new VectorEnum();
	  vectorEnum.printValues();
	  
  }

}
