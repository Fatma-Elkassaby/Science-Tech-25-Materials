public abstract class Vehcil {
    String modelName;
    String type;
    public Vehcil(String modelName){
        this.modelName = modelName;
    }
    public void start(){
        System.out.println(modelName+" is starting");
    }
    public void stop(){
        System.out.println(modelName+" is stopping");
    }
    public void accelerate(){
        System.out.println(modelName+"("+type+")"+" is accelerating");
    }
    public abstract void displayInfo();
}
