// This will not compile because the statements are not inside a method or function,
// the fix is to add them to the inexistent main method

class Exercise1C {
	public static void main(String[] args) {
		int x = 5;
		while ( x > 1 ) {
			x = x - 1;
			if ( x < 3 ) {
				System.out.println("small x");
			}
		}
	}
}
