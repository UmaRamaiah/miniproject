package collection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Movie movie1 = new Movie(1, "Amarkalam", "Saran", 2, 3.2);
	        Movie movie2 = new Movie(2, "Ok Kanmani", "Mani Rathnam", 2, 3.5);
	        Movie movie3 = new Movie(3, "Smile", "Parker", 3, 3.8);
	        Movie movie4 = new Movie(4, "Leo", "Lokesh", 3, 4.5);
	        LinkedHashSet<Movie> set = new LinkedHashSet<>();

	        set.add(movie1);
	        set.add(movie2);
	        set.add(movie3);
	        set.add(movie4);
	        
	        // Iterate through the LinkedHashSet 
	        for (Movie movie : set) {
	            System.out.println(movie);
	            

	}

}
}
