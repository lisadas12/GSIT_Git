package weeklyassignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12;
		int a = 0, b = 1;

		System.out.println("Febonacci Series is:");

		for (int i = 1; i <= n; i++) {
			if (a > 100)
				break;
			System.out.print(a + " ");

			int f = a + b;
			a = b;
			b = f;
		}
	}

}
