package modul2.latihan;

public class Car {
    int cadence;
    int speed;
    int gear;

    void changeCadence(int newCadence) {
        cadence = newCadence;
    }

    void speedUp(int increment) {
        speed += increment;
    }

    void changeGear(int newGear) {
        gear = newGear;
    }

    void printInfo() {
        System.out.println("Cadence: " + cadence + "\nSpeed: " + speed + "\nGear: " + gear + "\n");
    }
}
