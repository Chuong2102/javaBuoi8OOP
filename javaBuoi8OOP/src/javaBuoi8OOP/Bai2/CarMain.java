package javaBuoi8OOP.Bai2;
import java.io.*;
import javaBuoi8OOP.Student;

public class CarMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Car c = new Car("Mercedes 123", "Turbo", 4, "21-02-2021");
		
		//Seriable
		//
		FileOutputStream fos = new FileOutputStream("D:\\Car.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(c);
	    
	    // De-serializing 'a'
	    FileInputStream fis = new FileInputStream("D:\\Car.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Car b = (Car)ois.readObject(); 
	    // down-casting object
	    System.out.print(b.toString());
	
	    // closing streams
	    oos.close();
	    ois.close();
	}

}
