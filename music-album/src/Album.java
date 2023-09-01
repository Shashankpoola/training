
public class Album {

	String title;
	String artist;
	String genre;

	public Album(String i, String artist, String d) {
		super();
		this.title = i;
		this.artist = artist;
		this.genre = d;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Album [title=" + title + ", artist=" + artist + ", genre=" + genre + "]";
	}
	
}
