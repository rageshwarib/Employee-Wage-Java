public class EmpWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	int EMP_RATE_PER_HOUR , MAX_WORKING_DAYS , MAX_HRS_IN_MONTH ;

	public void empWageMethod(int empRatePerHr, int maxWorkingDays, int hrsInMonth) {
		EMP_RATE_PER_HOUR = empRatePerHr;
		MAX_WORKING_DAYS = maxWorkingDays;
		MAX_HRS_IN_MONTH = hrsInMonth;
	}

	public void EmpWageComputationMethod(int companyCount) {
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
		System.out.println("Total Employee Wage for comapny "+ companyCount + " is: " + totalEmpWage);
		System.out.println();
	}
}
