public class Car extends Vehcil implements Upgrade{
  public Car(String modelName){
   super(modelName);
      type="Car";
  }

    public  void displayInfo()
    {
       System.out.println("This is a car:"+this.modelName);
    }
    public void upgradeEngine(){
        System.out.println(modelName+" "+"(Car)"+"engine is being upgraded");
    }
}
