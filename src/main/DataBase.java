package main;

import java.util.*; 

import java.io.*;

public class DataBase implements Serializable{

	private List<Person> listOfPerson;
	
	public DataBase(){
		listOfPerson = new ArrayList<Person>();
	}
		
	public void add(Person person){
		listOfPerson.add(person);
	}

	public String toString(){
		StringBuilder string = new StringBuilder();
		for(Person person : listOfPerson){
			string.append(person.toString() + "\n");
		}
		return string.toString();
	}

}