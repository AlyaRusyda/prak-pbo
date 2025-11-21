package modul8;

class Bank {
    public int rasioBunga() {
        return 0;
    }
}

class BankPribadi extends Bank {
    @Override
    public int rasioBunga() {
        return 10;
    }
}

class BankUmum extends Bank {
    @Override
    public int rasioBunga() {
        return 8;
    }
}

class BankPasar extends BankUmum {
    @Override
    public int rasioBunga() {
        return 6;
    }
}

class BankSyariah extends BankUmum {
    @Override
    public int rasioBunga() {
        return 4;
    }
}

public class DemoBank {
    public static void main(String[] args) {
        Bank b1 = new BankPribadi();
        Bank b2 = new BankUmum();
        Bank b3 = new BankPasar();
        Bank b4 = new BankSyariah();

        System.out.println("Rasio bunga Bank Pribadi : " + b1.rasioBunga() + "%");
        System.out.println("Rasio bunga Bank Umum    : " + b2.rasioBunga() + "%");
        System.out.println("Rasio bunga Bank Pasar   : " + b3.rasioBunga() + "%");
        System.out.println("Rasio bunga Bank Syariah : " + b4.rasioBunga() + "%");
    }
}
