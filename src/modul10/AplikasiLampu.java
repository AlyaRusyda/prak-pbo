package modul10;

import java.util.Scanner;

public class AplikasiLampu {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);

        lampu.statusLampu = lampu.setSaklar(0);
        int pilihan;

        do {
            System.out.println("\nStatus lampu = " + lampu.statusLampu);
            System.out.println("1 untuk menyalakan lampu");
            System.out.println("2 untuk meredupkan lampu");
            System.out.println("0 untuk mematikan lampu");
            System.out.println("3 untuk keluar dari program");

            System.out.print("Pilihan: ");
            pilihan = lampu.setSaklar(sc.nextInt());

            switch (pilihan) {
                case 1:
                    lampu.hidupkanLampu();
                    break;
                case 2:
                    lampu.redupkanLampu();
                    break;
                case 0:
                    lampu.matikanLampu();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }
}
