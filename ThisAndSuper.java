package com.infy.aiapi;

class Parent{
	
	Parent()
	{
		System.out.println("Empty parent");
	}
	
	Parent(int a)
	{
		System.out.println("Int "+a+" parent");
	}
}

class Child extends Parent {
	Child(int a){
		this();
		System.out.println("Int "+a+" parent");
	}
	Child(){
		super(10);
		System.out.println("Empty child");
	}
	
}
public class ThisAnsSuper {
	
	public static void main(String str[])
	{
		Child ch= new Child(10);
	}

}
