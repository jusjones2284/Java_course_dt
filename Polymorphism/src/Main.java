import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();

//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();

//        Movie theMovie = Movie.getMovie("Doc", "bad boys");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}