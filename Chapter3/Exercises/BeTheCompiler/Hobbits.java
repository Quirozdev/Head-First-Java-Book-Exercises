class Hobbits {
	String name;
	
	public static void main(String [] args) {
		Hobbits [] h = new Hobbits[3];
		int z = 0;

		// there will be an index
		// out of bounds exception because at some point
		// it will try to access h[3] and h[4] which are out of
		// bounds (from 0 to 2 inclusive)
		// to fix it, the while condition needs to change from
		// z < 4 to z < 3 and the iteration variable needs to be
		// at the end of the while body
		while (z < 3) {
			h[z] = new Hobbits();
			h[z].name = "bilbo";
			if (z == 1) {
				h[z].name = "frodo";
			}
			if (z == 2) {
				h[z].name = "sam";
			}
			System.out.print(h[z].name + " is a ");
			System.out.println("good Hobbit name");
			z = z + 1;
		}
	}
}
