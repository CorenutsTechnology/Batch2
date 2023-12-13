package com.feujisolidprinciple;

class FileReader {
    public void readFile(String fileName) {
        System.out.println("read the file..");
    }
}

class FileWriter {
    public void writeFile(String fileName, String data) {
        System.out.println("write operation performed on file..");
    }
}

class FileManipulator {
    public void manipulateFile(String fileName) {
        System.out.println("manipulated the file..");
    }
}
public class FileManagerTest 
{
	
public static void main(String[] args) 
{
	FileReader read=new FileReader();
	read.readFile("FileManager.java");
	
}
}
