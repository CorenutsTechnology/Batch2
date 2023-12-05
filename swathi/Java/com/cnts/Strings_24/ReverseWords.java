package com.cnts.Strings_24;
//program 6
public class ReverseWords {

//    public void reverseWordsOfGivenString(String input) {
//        String reverse = "";
//        String[] words = input.split(" ");
//
//        for (int i = words.length - 1; i >= 0; i--) {
//            reverse += reverseWord(words[i]);
//
//            if (i > 0) {
//                reverse += " ";
//            }
//        }
//
//        System.out.print(reverse);
//    }
//
//    private String reverseWord(String word) {
//        String reversedWord = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            reversedWord =word.charAt(i)+reversedWord;
//        }
//        return reversedWord;
//    }
	
	public void  reverseWordsOfGivenString(String name) {
		String reverse="";
		String input[]=name.split(" ");
		for(int i=input.length-1;i>=0;i--) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		
	}

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        reverseWords.reverseWordsOfGivenString("CoreNuts Technologies Pvt Ltd");
    }
}
