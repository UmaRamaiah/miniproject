package collection;

public class Movie implements Comparable<Movie>{
	    private int id;
	    private String title;
	    private String director;
	    private int duration;
	    private double rating;

	    public Movie(int id,
	    		String title,
	    		String director,
	    		int category, 
	    		double rating) {
	    	this.id=id;
	        this.title = title;
	        this.director = director;
	        this.duration = duration;
	        this.rating = rating;
	    }

	    public String getTitle() {
	        return title;
	    }
	    public float getRating() {
	        return (float) rating;
	    }

	    @Override
	    public String toString() {
	        return "Movie[id=" + id + ",title=" + title + ",director=" + director + ",duration=" + duration + ",rating=" + rating + "]";
	    }

		@Override
		public int compareTo(Movie m) {
			// TODO Auto-generated method stub
			return Float.compare((float) rating, m.getRating());
		}

		

}
