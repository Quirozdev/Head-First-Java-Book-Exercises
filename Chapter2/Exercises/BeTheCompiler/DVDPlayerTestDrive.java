class DVDPlayerTestDrive {
	public static void main(String[] args) {
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		// it will not compile because this method is not defined in the DVDPlayer class
		// to fix it, the method needs to be added
		d.playDVD();

		if (d.canRecord == true) {
			d.recordDVD();
		}
	}
}
