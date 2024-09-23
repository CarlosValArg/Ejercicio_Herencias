package org.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep {
	private HashMap<Integer, SalesRep> salesTeam = new HashMap<>();

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade, HashMap<Integer, SalesRep> salesTeam) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		salesTeam.put(7, new SalesRep("Carlos", "Valencia", 2024, 25, 222, 7, 405.50, 1, 770.50));
		salesTeam.put(2, new SalesRep("Mauricio", "Ballesteros", 2023, 601, 187, 6, 396.75, 2, 640.20));
		salesTeam.put(12, new SalesRep("Hugo", "Coronado", 2021, 27, 1005, 28, 380.50, 4, 940.50));
		salesTeam.put(9, new SalesRep("Javier", "Pedraza", 2022, 28, 777, 21, 424.20, 3, 770.40));
		this.salesTeam=salesTeam;
	}

	public HashMap<Integer, SalesRep> getSalesTeam() {
		return salesTeam;
	}

	public void setSalesTeam(HashMap<Integer, SalesRep> salesTeam) {
		this.salesTeam = salesTeam;
	}

	@Override
	public String toString() {
		return "SalesManager [getSalesTeam()=" + getSalesTeam() + ", getSalesMade()=" + getSalesMade() + ", toString()="
				+ super.toString() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getRegistration()=" + getRegistration() + ", getAge()=" + getAge() + ", getDaysWorked()="
				+ getDaysWorked() + ", getVacationDaysTaken()=" + getVacationDaysTaken() + ", getSalary()="
				+ getSalary() + ", getYearsWorked()=" + getYearsWorked() + "]";
	}

	public void calculateComission(){
	      // 0.03 * all sales made by team
		for (Integer key: salesTeam.keySet()) {
			calculateComission= key*0.03;
			System.out.println(calculateComission);
		}
	   }
	//for (String key : colores.keySet()) {
//			System.out.println(key + "=" + colores.get(key));
	

}
