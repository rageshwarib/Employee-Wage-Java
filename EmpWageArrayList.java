import java.util.ArrayList;
public class EmpWageArrayList {
	public static void main(String[] args) {
		ArrayList<EmpWageBuilder> empWage = new ArrayList<EmpWageBuilder>();
		empWage.add(new EmpWageBuilder(20, 2, 10));
		empWage.add(new EmpWageBuilder(25, 2, 15));
		empWage.add(new EmpWageBuilder(30, 5, 20));
		empWage.add(new EmpWageBuilder(20, 4, 15));
		empWage.add(new EmpWageBuilder(15, 3, 20));
		for (EmpWageBuilder i : empWage) {
			i.EmpWageComputation();
		}
	}
}
