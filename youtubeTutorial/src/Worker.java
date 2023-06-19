public class Worker {

    public void doWork(){

        System.out.println("Does unskilled work.");
        earnMinimumWage();
        takeALunch();
    }

    private void earnMinimumWage(){
        System.out.println("Earns min wage");
    }

    private void takeALunch(){

        System.out.println("go to whole foods.");
        System.out.printf("..%s%n".repeat(2),
                "that food was good",
                "lunch on you next time"
                );
    }

}





