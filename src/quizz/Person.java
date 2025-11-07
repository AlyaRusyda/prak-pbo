package quizz;

public class Person {
    // Atribut
    String name;
    int age;
    String address;

    // Constructor untuk inisialisasi atribut
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("===== Data Person =====");
        System.out.println("Nama    : " + name);
        System.out.println("Umur    : " + age + " tahun");
        System.out.println("Alamat  : " + address);
        System.out.println("=======================");
    }
}
