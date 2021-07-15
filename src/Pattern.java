
public class Pattern {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++)

			{
				System.out.print("*");
			}

			System.out.println("");
		}

		for (int k = 2; k <= 4; k++) {
			for (int a = 4; a >= k; a--)

			{
				System.out.print("*");
			}

			System.out.println("");
		}

	}
}