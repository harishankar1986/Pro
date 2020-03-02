
public class MultiMeth {
	private String fMovie;
	
	public void setMovie (String movieName) {
		fMovie = movieName;
	}
	
	public String getMovie( ) {
		return fMovie;
	}
	
	public void fResult () {
		System.out.printf("Your Favoriate Movie is %s", getMovie());
	}
	
}
