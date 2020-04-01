import java.util.ArrayList;
import java.util.Scanner;

public class EmpWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR ;
	int MAX_WORKING_DAYS ;
	int MAX_HRS_IN_MONTH ;
	int ID;

	public EmpWageBuilder(int id , int epRatePerHr, int maxWorkingDays, int maxHrsInMonth) {
	ID = id ;
	EMP_RATE_PER_HOUR = epRatePerHr;
	MAX_WORKING_DAYS = maxWorkingDays;
	MAX_HRS_IN_MONTH = maxHrsInMonth;
	}
	//Method  for Employee Wage Computation
	public void EmpWageComputation() {
		// Variables
		int empHrs = 0 , totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays ++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 2;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 5;
				break;
			case IS_FULL_TIME:
				empHrs = 10;
				break;
			default:
				empHrs = 0;
			}
			int empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + " Employee hour: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage "+ totalEmpWage);
		System.out.println();
	}

	public static void main(String[] args) {

	ArrayList<EmpWageBuilder> empWage = new ArrayList<EmpWageBuilder>();
	empWage.add(new EmpWageBuilder(1001 ,20, 2, 10));
	empWage.add(new EmpWageBuilder(1002, 15, 2, 15));
	empWage.add(new EmpWageBuilder(1003, 30, 5, 20));
	empWage.add(new EmpWageBuilder(1004, 20, 4, 15));
	empWage.add(new EmpWageBuilder(1005 ,15, 3, 20));
	System.out.println("Enter Company id Number::");
	Scanner scanner = new Scanner(System.in);
	int CompanyId = scanner.nextInt();
	for (int i = 0; i < empWage.size(); i++) {
		EmpWageBuilder IdList = empWage.get(i);
		if (IdList.ID == CompanyId )
			IdList.EmpWageComputation();
	}
	}
}


