package com.crnt.string.nov2423;

public class BufferDelete {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("delete technologies");
		buffer.delete(7, 19);
		System.out.println(buffer);
	}

}
