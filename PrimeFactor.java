package weeklyassignment;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 60;
		System.out.println("Prime factors");

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				int count = 0;

				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						count++;

				}

				if (count == 2) {
					System.out.println(i + " ");
				}

			}
		}
	}
}
