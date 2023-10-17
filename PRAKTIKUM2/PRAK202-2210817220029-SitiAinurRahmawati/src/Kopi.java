public class Kopi {
    String namaKopi;
    String ukuran;
    float harga;
    private String Pembeli;

    public Kopi() {
    }

    public String getPembeli() {
        return Pembeli;
    }

    public void setPembeli(String pembeli) {
        Pembeli = pembeli;
    }

    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: " + harga);
    }

    public float getPajak() {
        return 11 * harga / 100;
    }
}
