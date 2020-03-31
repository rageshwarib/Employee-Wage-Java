//Welcome to Employee Wage Problem
public class EmpWageBuilder implements EmpWageInterface {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int IS_OVER_TIME = 3;
	//Creating a Employee Wage Computation method for company BridgeLabz
	public void EmpWageComputationForBridgelabz() {
		int EMP_RATE_PER_HOUR = 20 ;
		int MAX_WORKING_DAYS = 2;
		int MAX_HRS_IN_MONTH = 10;
		System.out.println("BridgeLabz Employee Details");
		// Variables
		int empHrs = 0 , totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays ++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 2;
			if (empCheck == 1) {
				empHrs = 8;
			}
			else {
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Employee hour: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage "+ totalEmpWage);
		System.out.println();
	}
	//Creating a Employee Wage Computation method for company Infosys
	public void EmpWageComputationForInfosys() {
		int EMP_RATE_PER_HOUR = 25 ;
		int MAX_WORKING_DAYS = 3;
		int MAX_HRS_IN_MONTH = 10;
		System.out.println("Infosys Employee Details");
		// Variables
		int empHrs = 0 , totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays ++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_OVER_TIME:
				empHrs = 3;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Employee hour: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage "+ totalEmpWage);
		System.out.println();
	}
	//Creating a Employee Wage Computation method for company Capgemini
	public void EmpWageComputationForCapgemini() {
		int EMP_RATE_PER_HOUR = 15 ;
		int MAX_WORKING_DAYS = 4;
		int MAX_HRS_IN_MONTH = 20;
		System.out.println("Capgemini Employee Details");
		// Variables
		int empHrs = 0 , totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < MAX_WORKING_DAYS) {
			totalWorkingDays ++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 4;
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
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Employee hour: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage "+ totalEmpWage);
		System.out.println();
	}

	public static void main(String[] args) {
		EmpWageInterface empWage = new EmpWageBuilder();
		empWage.EmpWageComputationForBridgelabz();
		empWage.EmpWageComputationForInfosys();
		empWage.EmpWageComputationForCapgemini();
	}
}
