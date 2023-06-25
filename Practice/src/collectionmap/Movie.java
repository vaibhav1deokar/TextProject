package collectionmap;

public class Movie {

	int movieid, boc;
	String moviename, producername;

	public Movie(int movieid, int boc, String moviename, String producername) {

		this.movieid = movieid;
		this.boc = boc;
		this.moviename = moviename;
		this.producername = producername;
	}

	public String toString() {
		return movieid + " " + moviename + " " + producername + " " + boc;
	}

}
