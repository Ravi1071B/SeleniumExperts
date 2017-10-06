package com.virphy.practice;

class SimpleConstrucor
{
	String name;
	int age;
	String address;

		SimpleConstrucor(String name , int age,String address )
		{
			this.name=name;;
			this.age=age;
			this.address=address;
	}
	
}
public class Construcor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			
		System.out.println("program starting");
		SimpleConstrucor constructor = new SimpleConstrucor("Ravi",23,"Hyderabad");
		System.out.println(constructor.name);
		System.out.println(constructor.age);
		System.out.println(constructor.address);
		System.out.println("program Ending");
		
		}
	}

}
