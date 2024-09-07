class Song implements Comparable<Song> {
	String title;
	String artist;
	String rating;
	String bpm;

	Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

	public boolean equals(Object aSong) {
		Song s = (Song) aSong;
		return getTitle().equals(s.getTitle());
	}

	public int hashCode() {
		return title.hashCode();
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	public String toString() {
		return title;
	}

	public int compareTo(Song another) {
                int minLength = Math.min(title.length(), another.title.length());
                for (int i = 0; i < minLength; i++) {
                        if (title.charAt(i) == another.title.charAt(i)) {
                                continue;
                        } else if (title.charAt(i) > another.title.charAt(i)) {
                                return 1;
                        } else {
                                return -1;
                        }
                }
		if (title.length() > another.title.length()) {
			return 1;
		} else if (title.length() < another.title.length()) {
			return -1;
		}
                return 0;
        }
}
