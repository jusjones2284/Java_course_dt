public class Nextmain {

    public static void main(String[] args) {

//        Movie movie = Movie.getMovie("A", "Jaws");
//        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

//        Object comedy = Movie.getMovie("C", "Airplane");
//        comedy.watchMovie();


        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();
        //var, is a special contextual keyword in Java, that lets our code take advantage of Local Variable Type Inference.
        //By using var as the type, we're telling Java to figure out the compile-time type for us.

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();

        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }


    }
}