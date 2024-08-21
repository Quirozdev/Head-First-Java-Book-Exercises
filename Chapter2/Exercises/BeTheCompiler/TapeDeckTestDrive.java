class TapeDeckTestDrive {
	public static void main(String[] args) {
		// it will no compile because t was not instantiated,
		// to fix it it needs to be instantiated
		TapeDeck t = new TapeDeck();
		t.canRecord = true;
		t.playTape();

		if (t.canRecord == true) {
			t.recordTape();
		}
	}
}
