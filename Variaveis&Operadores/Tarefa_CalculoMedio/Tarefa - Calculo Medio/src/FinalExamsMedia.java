/**
 * Main class to make the calculations.
 * @author nahum
 */
public class FinalExamsMedia {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("John");
		s1.setAge(23);
		s1.setGrade(9);
		s1.setFirstBimonthly(7.89);
		s1.setSecondBimonthly(9.00);
		s1.setThirdBimonthly(4.00);
		s1.setFourthBimonthly(8.15);
		/**
		 * Using if-else to do a little more than the requested.
		 */
		double finalMedia = (s1.getFirstBimonthly() + s1.getSecondBimonthly() + s1.getThirdBimonthly() + s1.getFourthBimonthly()) / 4;
		if (finalMedia >= 7){
			System.out.println("Your average is: " + finalMedia);
			System.out.println("Approved!");
		}else if (finalMedia < 7){
			System.out.println("Failed!");
		}
	}
}

