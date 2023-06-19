public class Movie {

    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");

    }

    public static Movie getMovie(String type, String title){

        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            case 'H' -> new HorrorFilm(title);

            default -> new Movie(title);
        };

    }
}


class Adventure extends Movie{

    public Adventure(String title){
        super(title);
    }

    //%s replaces a string
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens"
                );
    }
}

class Comedy extends Movie{

    public Comedy(String title){
        super(title);
    }

    //%s replaces a string
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending"
        );
    }
}

class ScienceFiction extends Movie{

    public ScienceFiction(String title){
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do bad stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up"
                );
    }
}

class HorrorFilm extends Movie {

    public HorrorFilm(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Candy man is top five horror film for me",
                "Scream was a great horror film",
                "The ring was scary."
                );
    }
}