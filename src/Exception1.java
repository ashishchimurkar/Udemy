public class Exception1 {

	public static void main(String[] args) {
		/*
		 * try { FileInputStream fs = new FileInputStream("D:/abc.txt"); } catch
		 * (FileNotFoundException e) {
		 * 
		 * System.out.println(e); }
		 */

		try {
			int a = 10, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {

			// Below are three ways to print the error message/stack trace

			// System.out.println(e);
			e.printStackTrace();
			// System.out.println(e.toString());
			// System.out.println(e.getMessage());
		}

		/*
		 * System.out.println(1); try { System.out.println(2); String[] name = {
		 * "Ashish", "Manoj", "Manish", "Mamta" }; System.out.println(3);
		 * System.out.println(name.length); System.out.println(10);
		 * 
		 * } catch (Exception e) { System.out.println(4); System.out.println(e);
		 * System.out.println(5); }
		 */
		finally {
			System.out.println("Hello, This is Finally Block");
		}

	}

}
