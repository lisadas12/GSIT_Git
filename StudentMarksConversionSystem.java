package weeklyassignment;

public class StudentMarksConversionSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// store marks in float
		float marks = 87.6f;

		// convert float to double
		double doubleMarks = marks;

		// convert float to int
		int intMarks = (int) marks;

		// convert into to char
		char charValue = (char) intMarks;

		System.out.println("Float Value:" + marks);
		System.out.println("Double Value:" + doubleMarks);
		System.out.println("Integer value:" + intMarks);
		System.out.println("ASCII:" + charValue);

	}

}
