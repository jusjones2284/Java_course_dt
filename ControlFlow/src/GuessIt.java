import java.util.Random;

public class GuessIt {

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(3) + 1;
        System.out.println(randomNum);

        switch (randomNum){
            case 1:
                System.out.println("random num equal 1");
                break;
            case 2:
                System.out.println("random num equal 2");
                break;
            case 3:
                System.out.println("random num equal 3");
                break;
            default:
                System.out.println("random num equal none of these");

        }

        switch (randomNum){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }

        String command = "stop";

        switch (command){
            case "go":
                System.out.println("keep going");
                break;
            case "yellow":
                System.out.println("yeild");
                break;
            case "stop":
                System.out.println("red");
                break;
            default:
                System.out.println("blue");
        }

        if(command.equals("going")){
            System.out.println("going to the store");
        } else if (command.equals("stop")) {
            System.out.println("we re not going to the store");

        }
//
//        if (randomNum == 3){
//            System.out.println("we got it");
//        } else System.out.println("not 3 but " + randomNum);


    }



}
