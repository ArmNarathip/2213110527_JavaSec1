
public class Lab309 {

	public static void main(String[] args) {
		// Declare constants
		final int SALARY_CEILING = 6000;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		// Declare variables
		int salary, age; // to be input
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		......
		// Check the contribution cap
		contributableSalary = ......
		// Compute various contributions in "double" using a nested-if to handle 4 cases
		if (age <= 55) { // 55 and below
		......
		} else if (age <= 60) { // (60, 65]
		......
		} else if (age <= 65) { // (55, 60]
		......
		} else { // above 65
		......
		}
		......
	}

}
