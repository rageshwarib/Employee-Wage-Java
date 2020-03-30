// Welcome to Employee Wage prblem
public class EmpWageBuilder {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public int EMP_RATE_PER_HOUR , MAX_WORKING_DAYS , MAX_HRS_IN_MONTH ;
	
	public void setEMP_RATE_PER_HOUR(int empRate) {
		EMP_RATE_PER_HOUR = empRate;
	}
	public void setMAX_WORKING_DAYS(int maxWorkingDays) {
		MAX_WORKING_DAYS = maxWorkingDays;
	}
	public void setMAX_HRS_IN_MONTH(int hrsInMonth) {
		MAX_HRS_IN_MONTH = hrsInMonth;
	}

	public static void main(String[] args) {
		EmpWageBuilder bridgelabzEmpWage = new EmpWageBuilder();
		EmpWageBuilder infosysEmpWage = new EmpWageBuilder();

		System.out.println("BridgeLabz Employee Details::");
		bridgelabzEmpWage.setEMP_RATE_PER_HOUR(20);
		bridgelabzEmpWage.setMAX_WORKING_DAYS(2);
		bridgelabzEmpWage.setMAX_HRS_IN_MONTH(10);
		bridgelabzEmpWage.EmpWageComputationMethod();
		System.out.println();
		System.out.println("Infosys Emploee Details::");
		infosysEmpWage.setEMP_RATE_PER_HOUR(30);
		infosysEmpWage.setMAX_WORKING_DAYS(2);
		infosysEmpWage.setMAX_HRS_IN_MONTH(15);
		infosysEmpWage.EmpWageComputationMethod();
	}
	private void EmpWageComputationMethod() {
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

