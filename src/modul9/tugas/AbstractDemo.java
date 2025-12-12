package modul9.tugas;

public class AbstractDemo {
    public static void main(String[] args) {
        Balok blk = new Balok();
        Kubus kbs = new Kubus();
        Bola bl = new Bola();
        Kerucut krct = new Kerucut();
        PrismaSegitiga ps = new PrismaSegitiga();

        System.out.println("---Balok---" + "\n" +
                "Volume      = " + blk.getVolume() + "\n" +
                "Luas Permukaan = " + blk.getLuasPermukaan());

        System.out.println("\n---Kubus---" + "\n" +
                "Volume      = " + kbs.getVolume() + "\n" +
                "Luas Permukaan = " + kbs.getLuasPermukaan());

        System.out.println("\n---Bola---" + "\n" +
                "Volume      = " + bl.getVolume() + "\n" +
                "Luas Permukaan = " + bl.getLuasPermukaan());

        System.out.println("\n---Kerucut---" + "\n" +
                "Volume      = " + krct.getVolume() + "\n" +
                "Luas Permukaan = " + krct.getLuasPermukaan());

        System.out.println("\n---Prisma Segitiga---" + "\n" +
                "Volume      = " + ps.getVolume() + "\n" +
                "Luas Permukaan = " + ps.getLuasPermukaan());
    }
}