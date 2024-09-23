package org.generation.classes;

import java.util.Iterator;

public class Employee {
	private String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDaysTaken;
	private double salary;
	private int yearsWorked;
	
	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}

	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}

	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearsWorked() {
		return yearsWorked;
	}

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}

	public int timeToRetirement(){
	      // time to retirement = min(60 - age, 40 - yearsWorked)
		if(yearsWorked>=40 && age>=60);{
		System.out.println("Feliz retiro");
	   }else {
		System.out.println("Debes seguir trabajando");
	   }
	}
	   public int vacationTimeLeft(){
	       // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
		   Employee vtl= Employee.get(daysWorked);
		   for((daysWorked/360)*(30-vacationDaysTaken));
	   }

	   public double calculateBonusCarlos(){
	       // bonus = 2.2*salary
		   double salary, bonus;
			salary= 405.50;
			bonus=2.2;
			return salary*bonus;
			
	   }
	
}
