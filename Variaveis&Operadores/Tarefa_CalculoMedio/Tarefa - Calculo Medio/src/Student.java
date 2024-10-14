import java.util.Random;

/**
 * An object for the student, with some more implem. for a future use.
 * @author nahum
 */
public class Student {
	public String name;
	public int age;
	public int grade;
	public int ID;

	/**
	 * ID randomizer, future use.
	 * @see Random
	 */
	public Student(){
		Random random = new Random();
		this.ID = random.nextInt();
	}

	public double firstBimonthly;
	public double secondBimonthly;
	public double thirdBimonthly;
	public double fourthBimonthly;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getFirstBimonthly() {
		return firstBimonthly;
	}

	public void setFirstBimonthly(double firstBimonthly) {
		this.firstBimonthly = firstBimonthly;
	}

	public double getSecondBimonthly() {
		return secondBimonthly;
	}

	public void setSecondBimonthly(double secondBimonthly) {
		this.secondBimonthly = secondBimonthly;
	}

	public double getThirdBimonthly() {
		return thirdBimonthly;
	}

	public void setThirdBimonthly(double thirdBimonthly) {
		this.thirdBimonthly = thirdBimonthly;
	}

	public double getFourthBimonthly() {
		return fourthBimonthly;
	}

	public void setFourthBimonthly(double fourthBimonthly) {
		this.fourthBimonthly = fourthBimonthly;
	}

}


