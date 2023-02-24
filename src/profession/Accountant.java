package profession;

import human.*;

public class Accountant implements Human{
	private int age;
	
	private int experience;

	private String name;

	private float salary;	

	public Accountant(int age, int experience, String name, float salary){
		this.age = age;
	
		this.experience = experience;

		this.name = name;

		this.salary = salary;

		System.out.println("I'm an accountant");
	}	

	public int getAge(){
		return age;	
	}

	public float getSalary(){
		return salary;
	}

	public int getExperience(){
		return experience;
	}

	public String getName(){
		return name;
	}
}