package org.generation;
import org.generation.classes.Employee;
import org.generation.classes.SalesRep;
import org.generation.classes.SalesManager;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee ("Carlos", "Valencia", 2024, 25, 222, 7, 405.50, 1);
		System.out.println(employee1);
		SalesRep salesRep1 = new SalesRep ("Carlos", "Valencia", 2024, 25, 222, 7, 405.50, 1, 770.50);
		System.out.println(salesRep1);
		
		SalesManager salesManager1 = new SalesManager("Carlos", "Valencia", 2024, 25, 222, 7, 405.50, 1, 770.50, 7);

	}

}
