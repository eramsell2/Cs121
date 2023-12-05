package WeekTwelve.SetandIteratorActivity;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MovieCollectionSet {

        Set<String> movies = new HashSet<>();


        public void addMovies () {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter in a movie name or 0 to quit.");
            while (true) {
                String movieName = console.nextLine();
                if (movieName.equals("0")) {
                    break;
                }
                movies.add(movieName);
            }
        }
        public void displayMovies(){
            Iterator<String> iterator = movies.iterator();
            System.out.println("Movies in collection: ");
            while(iterator.hasNext()){
                String movieName = iterator.next();
                System.out.println(movieName);

            }
        }
    }

