package modul2.latihan;

public class BankAccount {
    double saldo;
    String noRekening;
    String nama;

    void cekSaldo() {
        System.out.println("Saldo saat ini: Rp" + saldo);
    }

    void menabung(double jumlah) {
        saldo += jumlah;
        System.out.println("Berhasil menabung Rp" + jumlah);
    }

    void menarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik Rp" + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    void transfer(BankAccount tujuan, double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Berhasil transfer Rp" + jumlah + " ke " + tujuan.nama);
        } else {
            System.out.println("Saldo tidak mencukupi untuk transfer!");
        }
    }
}
