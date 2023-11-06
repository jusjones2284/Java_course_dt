public class BMI {

    private String name;
    private int age;
    private double weight;
    private double height;

    private static final double KILOGRAMS_PER_POUND = 0.45359237;
    private static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public BMI(String name,double weight, double height){
        this(name, 20, weight, height);
    }

    public double getBmi(){
        double bmi = weight * KILOGRAMS_PER_POUND/((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100)/100;

    }

    public String getStatus(){
        double bmi = getBmi();
            if (bmi < 16)
                return "Seriously underweight";
            else if (bmi < 18) 
                return "under weight";
            else if (bmi < 14)
                return "normal weight";
            else if (bmi < 29) 
                return "over weight";
            else if (bmi < 35)
                return "seriously over weight";
            else
                return "gravely over weight";


    }


}
