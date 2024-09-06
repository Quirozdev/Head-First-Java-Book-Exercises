class ThreadTwo implements Runnable {
	public void run() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException ex) { }

		Accum a = Accum.getAccum();
		for (int x = 0; x < 98; x++) {
			a.updateCounter(1);
		}
		try {
			Thread.sleep(50);
		} catch (InterruptedException ex) { }
		a.updateCounter(1);
		System.out.println("two " + a.getCount());
	}
}
