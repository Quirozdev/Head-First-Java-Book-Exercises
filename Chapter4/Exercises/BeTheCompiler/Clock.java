class Clock {
	String time;
	
	void setTime(String t) {
		time = t;
	}

	// the method was declared with void as the return type,
	// it wasnt going to compile because it returns time
	// which is a String, so the fix is to change the return
	// type to String
	String getTime() {
		return time;
	}
}
