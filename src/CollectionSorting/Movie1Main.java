package CollectionSorting;

import java.util.HashSet;
import java.util.TreeSet;

import collection.Movie;

public class Movie1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie1 m1=new Movie1("bahubali","raj",3.4f,4.3f);
        Movie1 m2=new Movie1("Leo","logesh",3.3f,4.4f);
        Movie1 m3=new Movie1("Santhramugi","vasu",3.3f,4.2f);
    
        HashSet<Movie1> set=new HashSet<Movie1>();
        set.add(m3);
        set.add(m2);
        set.add(m1);
        for(Movie1 m:set)
        {
            System.out.println(m);
        }
       System.out.println("=============sorting");
       RatingSort r=new RatingSort();
       
       TreeSet<Movie1> set1=new TreeSet<Movie1>(r);
       set1.add(m3);
        set1.add(m2);
        set1.add(m1);
        for(Movie1 m:set1)
        {
            System.out.println(m);
        }


    }

	}


