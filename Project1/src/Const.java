
public class Const {
	
	private String fMovie;
	
	public Const (String x) {
		fMovie = x;
	}
	
	public void setMovie(String movieName) {
		fMovie = movieName;
	}
	
	public String getMovie () {
		return fMovie;
		
	}
	
	public void fResult () {
		System.out.printf("Your Favorite Movie is %s\n", getMovie());
	}
	
}
