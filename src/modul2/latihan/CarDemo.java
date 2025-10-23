package modul2.latihan;
public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        System.out.println("Mobil 1");
        car1.changeCadence(50);
        car1.speedUp(20);
        car1.changeGear(2);
        car1.printInfo();
        
        System.out.println("Mobil 2");
        car2.changeCadence(30);
        car2.speedUp(10);
        car2.changeGear(1);
        car2.printInfo();
    }
}
