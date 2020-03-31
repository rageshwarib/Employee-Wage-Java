public class EmpWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR ;
	int MAX_WORKING_DAYS ;
	int MAX_HRS_IN_MONTH ;

	public EmpWageBuilder(int epRatePerHr, int maxWorkingDays, int maxHrsInMonth) {
		EMP_RATE_PER_HOUR = epRatePerHr;
		MAX_WORKING_DAYS = maxWorkingDays;
		MAX_HRS_IN_MONTH = maxHrsInMonth;
	}
	//Mathod  for Employee Wage Computation
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
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Employee hour: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage "+ totalEmpWage);
		System.out.println();
	}
}
