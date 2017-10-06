package com.virphy.practice;

public class GetSet {
	public String name;
	public int ID;
	public double Salary;
	
	
	@SuppressWarnings("null")
	public static void main(String[] args) {

	//@SuppressWarnings("null")
	//public void (String Name,int ID,double salary) {
		String name="giddu";
		int ID1=121;
		double salary=1000;
		Employee boss=new Employee(name, ID1, salary);
		Employee getset = null;
		getset.setName(name);
		getset.setID(ID1);
		getset.setSalary(salary);
		boss.display();
		}
	}


