class BookTestDrive {
	public static void main(String [] args) {
		// this will not compile because the 3 books from the array
		// have not been instantiated, so it produces a NullPointerException
		// when trying to access a instance variable of a null variable
		
		Books [] myBooks = new Books[3];
		int x = 0;
		// here is the fix
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		// end of fix
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";

		while (x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}
	}
}
