
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student narathip = new Student("Narathip Changjai","1 Happy ave");
		System.out.println(narathip); //toString()
		
		//Test Setter and Getters 
		narathip.setAddress("617/132 Assakarn");
		System.out.println(narathip);
		System.out.println(narathip.getName());
		System.out.println(narathip.getAddress());
		
		//Test addCourseGrade(),printGrades() and getAverageGrade()
		narathip.addCourseGrade("INT107",50);
		narathip.addCourseGrade("INT108",50);
		narathip.addCourseGrade("MSC-202",50);
		narathip.printGrades();
		
		System.out.printf("\nThe average grade is %.2f%n",narathip.getAverageGrade());
	}

}
