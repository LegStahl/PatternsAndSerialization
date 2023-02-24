package main;

import read.Read;

import write.Write;

import java.io.*;

import java.util.*;

import human.*;

import choice.*;

public class Main{
	public static void main(String[] argv){
		Human human = Worker.getWorker(Choice.Marketer, 21, 5, "John", (float)21.500);
		
		/*try{
			DataBase dataBase = new DataBase();
			for(int i = 0; i < 6; i++){
				dataBase.add(new Person(4 * (i + 1), "Person" + 1, 5000 * (i + 1)));
			}
			Write writer = Write.getWriter();
			writer.write(dataBase);
			dataBase.add(new Person(600, "Person" + 20, 5000 * (5 + 1)));
			Read reader = Read.getReader();
			DataBase dataBase2 = reader.read();
			System.out.println(dataBase2);
		}catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		} 
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		*/
	}

}