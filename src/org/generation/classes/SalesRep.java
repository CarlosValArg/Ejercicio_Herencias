package org.generation.classes;

import java.util.Scanner;

public class SalesRep extends Employee {
	private double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}

	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}

	@Override
	public String toString() {
		return "SalesRep [getSalesMade()=" + getSalesMade() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge()
				+ ", getDaysWorked()=" + getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken()
				+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + "]";
	}
	
	 public double calculateComissionCarlos(){
	      // comission = 0.1 * salesMade
		double sales, comission;
		sales= 770.50;
		comission=0.1;
		return sales*comission;
		
		
		 
	   }
	
	
	

}
