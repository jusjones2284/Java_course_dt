public class ExceptionHandling {

    public static void main(String[] args) {

        int myInt = Integer.parseInt("4848");


        try {
            getInt();

        }
        catch (NumberFormatException nfe){
            System.out.println("Hey guy, you cant make a int out of that");
        }
        catch (NullPointerException e){
            System.out.println("catch a null pointer exception");
        }
        catch (Exception e){

            System.out.println("all type of exceptions");

        } finally {
            System.out.println("end here");
        }

    }


    public static void getInt(){
        int myInts = Integer.parseInt("fda");
    }
}
