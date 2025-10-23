package modul2.latihan;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount akun1 = new BankAccount();
        akun1.nama = "Cihuy";
        akun1.noRekening = "12345";
        akun1.saldo = 100000;

        BankAccount akun2 = new BankAccount();
        akun2.nama = "Kapiw";
        akun2.noRekening = "67890";
        akun2.saldo = 50000;

        akun1.cekSaldo();
        akun1.menabung(20000);
        akun1.menarik(50000);
        akun1.transfer(akun2, 30000);

        akun1.cekSaldo();
        akun2.cekSaldo();
    }
}
