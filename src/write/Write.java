package write;

import java.io.*;

import main.*;

public class Write{
	private ObjectOutputStream out = null;

	private static Write writer = null;

	private Write(){
		try{
			System.out.println(System.getProperty("user.dir"));

			System.out.println("In Write");
			 out = new ObjectOutputStream(new FileOutputStream(System.getProperty("user.dir") + "\\res\\list.bin"));
			System.out.println("In Write");
			writer = this;
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}	
	}
	
	public static Write getWriter(){
		if(writer == null){
			return new Write();
		}
		else
			return writer;
	}
	
	public void writeCount(int count)throws IOException, ClassNotFoundException{
		out.writeInt(count);
	}
	
	public void write(DataBase obj) throws IOException, ClassNotFoundException{
		out.writeObject(obj);
	}

	public void close() throws IOException, ClassNotFoundException{
		writer = null;
		out.close();
	}
}