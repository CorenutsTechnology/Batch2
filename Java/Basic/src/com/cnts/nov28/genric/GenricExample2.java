package com.cnts.nov28.genric;

//Generic interface
interface Pair<K, V> {
 K getKey();
 V getValue();
}

//Generic class implementing the generic interface
class OrderedPair<K, V> implements Pair<K, V> {
 private K key;
 private V value;

 public OrderedPair(K key, V value) {
     this.key = key;
     this.value = value;
 }

 @Override
 public K getKey() {
     return key;
 }

 @Override
 public V getValue() {
     return value;
 }
}

public class GenricExample2
{
 public static void main(String[] args) {
     // Example 1: String, Integer pair
     Pair<String, Integer> pair1 = new OrderedPair<>("One", 1);
     System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());

     // Example 2: Double, String pair
     Pair<Double, String> pair2 = new OrderedPair<>(3.14, "Pi");
     System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());

     // Example 3: Custom objects
     Pair<Boolean, Character> pair3 = new OrderedPair<>(true, 'A');
     System.out.println("Key: " + pair3.getKey() + ", Value: " + pair3.getValue());
 }
}

