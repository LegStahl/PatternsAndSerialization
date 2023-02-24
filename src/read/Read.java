package read;

import java.io.*;

import main.*;

public class Read{
	private ObjectInputStream objectInputStream;
	
	private static Read reader = null;
	
	private Read(){
		try{
			System.out.println(System.getProperty("user.dir"));

			System.out.println("In Read");
			this.objectInputStream = new ObjectInputStream(new FileInputStream( System.getProperty("user.dir") + "\\res\\list.bin"));
			System.out.println("In Read");
			reader = this;
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}	
			
	}
	
	public static Read getReader(){
		if(reader == null){
			return new Read();
		}
		else
			return reader;
	}

	public int readCount() throws IOException, ClassNotFoundException{
		return (int) this.objectInputStream.readInt();
	}
	
	public DataBase read() throws IOException, ClassNotFoundException{
		
		return ((DataBase) this.objectInputStream.readObject());
	}
	public void close() throws IOException, ClassNotFoundException{
		reader = null;
		this.objectInputStream.close();
	}
}