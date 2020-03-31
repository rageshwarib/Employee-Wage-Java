public class CompanyEmpWageArray {
	public static void main(String[] args) {
		EmpWageBuilder empWage[] = new EmpWageBuilder[3];
		for (int i = 0; i < empWage.length; i++) {
			empWage[i] = new EmpWageBuilder();
		}
		System.out.println("Company Details");
		System.out.println();
		empWage[0].empWageMethod(20, 2, 10);
		empWage[0].EmpWageComputationMethod(1);
		empWage[1].empWageMethod(15, 2, 8);
		empWage[1].EmpWageComputationMethod(2);
		empWage[2].empWageMethod(25, 3, 15);
		empWage[2].EmpWageComputationMethod(3);
	}
}
