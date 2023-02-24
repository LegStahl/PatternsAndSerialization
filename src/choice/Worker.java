package choice;

import human.*;

import profession.*;

public class Worker{
	
	public static Human getWorker(Choice choice, int age, int experience, String name, float salary){
			
		switch(choice){
			case Programmer:
				return new Programmer(age, experience, name, salary);
			case Marketer:
				return new Marketer(age, experience, name, salary);
			case CEO:
				return new CEO(age, experience, name, salary);
			case Accountant:
				return new Accountant(age, experience, name, salary);
			default:
				return null;
		}
		
	}
	
}