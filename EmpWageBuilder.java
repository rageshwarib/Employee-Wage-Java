// Welcome to Employee Wage prblem
public class EmpWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public int EMP_RATE_PER_HOUR , MAX_WORKING_DAYS , MAX_HRS_IN_MONTH ;
	
	public static void main(String[] args) {
		System.out.println("BridgeLabz Employee Details::");
		EmpWageBuilder bridgelabzEmpWage = new EmpWageBuilder(20, 2, 10);
		bridgelabzEmpWage.EmpWageCalculationMethod();
		System.out.println();
		System.out.println("Infosys Employee Details::");
		EmpWageBuilder infosysEmpWage = new EmpWageBuilder(30, 2, 8);
		infosysEmpWage.EmpWageCalculationMethod();
	}
	public EmpWageBuilder() {
		EMP_RATE_PER_HOUR = 0;
		MAX_WORKING_DAYS = 0;
		MAX_HRS_IN_MONTH = 0;
	}
	public EmpWageBuilder(int empRate , int workingDays , int hrsInMonth) {
		EMP_RATE_PER_HOUR = empRate;
		MAX_WORKING_DAYS = workingDays;
		MAX_HRS_IN_MONTH = hrsInMonth;
	}
	private void EmpWageCalculationMethod() {
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
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Employee hour: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage: " + totalEmpWage);
	}
}

