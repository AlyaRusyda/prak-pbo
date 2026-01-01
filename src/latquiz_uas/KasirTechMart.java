package latquiz_uas;

interface MetodePembayaran {
    double bayar(double jumlah);
    void cekSaldo();
}

class TransferBank implements MetodePembayaran {
    private double saldo = 1_000_000;

    @Override
    public double bayar(double jumlah) {
        saldo -= jumlah;
        return jumlah;
    }

    @Override
    public void cekSaldo() {
        System.out.println("Saldo Transfer Bank: Rp " + saldo);
    }
}

class KartuKredit implements MetodePembayaran {
    private double limit = 5_000_000;

    @Override
    public double bayar(double jumlah) {
        double admin = jumlah * 0.02;
        double total = jumlah + admin;
        limit -= total;
        return total;
    }

    @Override
    public void cekSaldo() {
        System.out.println("Sisa limit Kartu Kredit: Rp " + limit);
    }
}

public class KasirTechMart {
    public static void main(String[] args) {
        MetodePembayaran pembayaran = new KartuKredit();

        double totalBelanja = 500_000;
        double totalBayar = pembayaran.bayar(totalBelanja);

        System.out.println("Total Belanja : Rp " + totalBelanja);
        System.out.println("Total Dibayar : Rp " + totalBayar);
        pembayaran.cekSaldo();
    }
}
