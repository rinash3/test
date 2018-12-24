package intro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("./file_name");
		if(f.exists()){
		    System.out.println("file exists");
		}
		else{
		    System.out.println("file does not exist at this path");
		}
		
	}
		ArrayList<String> readFile(String filename)
		{
		  ArrayList<String> records = new ArrayList<String>();
		  try
		  {
		    BufferedReader reader = new BufferedReader(new FileReader(filename));
		    String line;
		    while ((line = reader.readLine()) != null)
		    {
		      records.add(line);
		    }
		    reader.close();
		    return records;
		  }
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred trying to read '%s'.", filename);
		    e.printStackTrace();
		    return null;
		  }
		}
	}


