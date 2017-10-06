package com.virphy.practice;

public class Employee {
	private String name="giddu";
	private int ID=121;
	private double salary=10000;
		public Employee( String name,int ID,double salary){
			setName(name);
			setID(ID);
			setSalary(salary);
		}
			public void display(){
				System.out.print("Employee,ID,salary");
			}	
			
	 void setSalary(double salary) {
			this.salary=salary;
			
		}
		void setID(int ID) { 
			this.ID=ID;
			
		}
		void setName(String name) {
			this.name=name;
		}
		
	/*public double getSsalary() {
		return salary;
	}
	public int getID() {
		return ID;
	}*/
	/*public String getName() {
		return name;
	}*/
}

