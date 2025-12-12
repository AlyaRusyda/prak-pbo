package modul10.latihan;

public class Mamalia implements ActivityAnimal {
    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }
    
    @Override
    public void travel() {
        System.out.println("Mammal travel");
    }
    
    public int noOfLegs() {
        return 0;
    }
    
    public static void main(String[] args) {
        Mamalia m = new Mamalia();
        m.eat();
        m.travel();
    }
}
