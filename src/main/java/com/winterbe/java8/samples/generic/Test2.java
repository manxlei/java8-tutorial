package com.winterbe.java8.samples.generic;

public class Test2<T> {

	public <T> T show(T one){//这是正确的    
        return one;    
    }    
	
	public static void main(String[] args) {
		Test2<String> test2 = new Test2<String>();
		Long returnVal = test2.show(Long.MAX_VALUE);
		
		System.out.println(returnVal);
	}
	
}
