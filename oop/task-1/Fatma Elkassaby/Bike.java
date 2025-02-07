public class Bike extends Vehcil implements Upgrade{
    public Bike(String modelName){
        super(modelName);
        type="Bike";
    }
    public  void displayInfo()
    {
        System.out.println("This is a bike:"+modelName);
    }
    public void upgradeEngine(){
        System.out.println(modelName+" "+"(Bike)"+"engine is being upgraded");
    }
}
