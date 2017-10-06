package com.virphy.practice;


class car
{
	double price;
	String colour;
	void move ()
	{
		System.out.println("car is moving");
	}
	
}
public class ClassAndObject {

	public static void main(String[] args) {
		
		car c1= new car();
		c1.price = 250000.00;
		c1.colour = "Red";
		c1.move();
		// TODO Auto-generated method stub
		{
			System.out.println("What type of colour car do you have = "  + c1.colour);
			System.out.println("What is the cost of car = " +c1.price);
		}
	}

}
