package CodingTest_1;

public abstract class Vehicle {
    private String modelName;
    private int maxSpeed;

    public Vehicle(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }
    public abstract void drive();
    public final void displayInfo(){
        System.out.println("Model : " + modelName + ","+" Max Speed : "+ maxSpeed);
    }
}
