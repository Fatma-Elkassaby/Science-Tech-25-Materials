// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Car car = new Car("Tesla Model S");
         car.start();
         car.accelerate();
         car.stop();
         Bike bike = new Bike("Harley Davidson");
         bike.start();
         bike.accelerate();
         bike.stop();
         car.upgradeEngine();
         bike.upgradeEngine();
         car.displayInfo();
         bike.displayInfo();
        }
    }
