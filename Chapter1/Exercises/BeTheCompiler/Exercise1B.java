// This one will not compile because the main method needs to be inside a class
// Here it is fixed
class Exercise1B {
	public static void main(String [] args) {
		int x = 5;
		while ( x > 1 ) {
			x = x - 1;
			if ( x < 3 ) {
				System.out.println("small x");
			}
		}
	}
}
