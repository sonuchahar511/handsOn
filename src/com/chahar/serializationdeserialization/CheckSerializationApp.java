package com.chahar.serializationdeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Demo implements java.io.Serializable {
	private static final long serialVersionUID = 11L;

	private String name;
	private Double salary;

	public Demo(String name, Double salary) {
		this.setName(name);
		this.setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}

public class CheckSerializationApp {
	public static void main(String[] args) {
		/*
		 * Demo object = new Demo("Ajay",12500.0); String filename =
		 * "/home/chahar/Desktop/file.ser";
		 * 
		 * // Serialization try { // Saving of object in a file FileOutputStream file =
		 * new FileOutputStream(filename); ObjectOutputStream out = new
		 * ObjectOutputStream(file);
		 * 
		 * // Method for serialization of object out.writeObject(object);
		 * 
		 * out.close(); file.close();
		 * 
		 * System.out.println("Object has been serialized");
		 * 
		 * } catch (IOException ex) { System.out.println("IOException is caught"); }
		 */

		Demo object1 = null;
		String filename = "/home/chahar/Desktop/file.ser";
		// Deserialization
		try {
			// Reading the object from a file
			/*FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);*/
			for (int i = 0; i < 10; i++) {
				FileInputStream file = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(file);
				object1 = (Demo) in.readObject();

				in.close();
				file.close();

				System.out.println("Object has been deserialized ");
				System.out.println("a = " + object1.getName());
				System.out.println("b = " + object1.getSalary());
			}
			// Method for deserialization of object

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
}