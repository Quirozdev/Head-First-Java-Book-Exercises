class Accum {

	private int counter = 0;
	private static Accum a = new Accum();

	private Accum() {}

	public int getCount() {
		return counter;
	}

	public void updateCounter(int add) {
		counter += add;
	}

	public static Accum getAccum() {
		return a;
	}
}
