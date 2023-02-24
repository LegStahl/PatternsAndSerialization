package main;

import java.io.*;

public class Person implements Serializable{

	private int age;

	private String name;

	private float money;

	public Person(int age, String name, float money){
		this.age = age;
		
		this.name = name;

		this.money = money;
	}

	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	public float getMoney(){
		return money;
	}
	
	public String toString(){
		return "Name:" + name + " age: " + age + " money: " + money;
	}
}