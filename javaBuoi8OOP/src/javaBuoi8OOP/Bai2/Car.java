package javaBuoi8OOP.Bai2;

import java.io.*;

public class Car implements Serializable {
	
	public Car() {
		
	}
	
	String name;
	String engine;
	int seats;
	String productionDate;
	
	
	
	public Car(String name, String engine, int seats, String productionDate) {
		super();
		this.name = name;
		this.engine = engine;
		this.seats = seats;
		this.productionDate = productionDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", engine: " + engine + ", seats: " + seats + ", productionDate: " + productionDate
				;
	}
	
	
	
}
