package modul10;

public class Lampu implements ActivityLampu {
    public int statusLampu;

    @Override
    public void matikanLampu() {
        if(statusLampu == LAMPU_MATI) {
            System.out.println("Lampu sudah dalam kondisi mati");
        } else {
            statusLampu = LAMPU_MATI;
            System.out.println("Lampu berhasil dimatikan");
        }
    }

    @Override
    public void hidupkanLampu() {
        if(statusLampu == LAMPU_HIDUP) {
            System.out.println("Lampu sudah dalam kondisi menyala");
        } else {
            statusLampu = LAMPU_HIDUP;
            System.out.println("Lampu berhasil dinyalakan");
        }
    }

    @Override
    public void redupkanLampu() {
        if(statusLampu == LAMPU_REDUP) {
            System.out.println("Lampu sudah dalam kondisi redup");
        } else {
            statusLampu = LAMPU_REDUP;
            System.out.println("Lampu berhasil diredupkan");
        }
    }

    public int setSaklar(int saklar) {
        return statusLampu = saklar;
    }
}
