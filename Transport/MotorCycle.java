package Transport;

public class MotorCycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    MotorCycle(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType) {
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie() {
        System.out.printf("Motorcycle %s %s is performing a wheelie\n", name, model);
    }  
}