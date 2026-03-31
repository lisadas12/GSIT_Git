package weeklyassignment;

public class CharASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
		int value1 = ch;
		System.out.println("ASCII Value:" + value1);

		int value2 = value1 + 5;
		System.out.println("New ASCII value:" + value2);

		char newChar = (char) value2;
		System.out.println("New Character:" + newChar);
	}

}
