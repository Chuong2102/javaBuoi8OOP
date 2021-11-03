package javaBuoi8OOP.Bai3;

import java.io.IOException;
import java.io.Serializable;
import java.io.File;  // Import the File class
import java.io.FileWriter;
public class NhapDuLieu implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String a = "con co be be";
		

		try {
			File myObj = new File("D:\\duLieu.txt"); // Specify the filename
			if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      }
			else {
		        System.out.println("File already exists.");
		      }
		}
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		try {
		      FileWriter myWriter = new FileWriter("D:\\duLieu.txt");
		      myWriter.write(a);
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
