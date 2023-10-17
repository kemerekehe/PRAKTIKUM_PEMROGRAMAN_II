public class Object {
    String Nama;
    double berat;
    double harga;
    double jumlah;
    double harga_belum_diskon;
    double total_diskon;
    double harga_sudah_diskon;

    public Object(String nama, double berat, double harga, double jumlah) {
        Nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah = jumlah;
        this.harga_belum_diskon = jumlah/berat * harga;
        this.total_diskon = 0.02 * (4 * harga) * Math.floor(jumlah/4);
        this.harga_sudah_diskon = harga_belum_diskon - total_diskon;
    }

    public void tampil() {
        System.out.println("Nama Buah: ayam " + Nama);
        System.out.println("Berat: " + berat);
        System.out.printf("Harga: %.1f \n", harga);
        System.out.printf("Jumlah Beli: %.1f kg\n", jumlah);
        System.out.printf("Harga Sebelum Diskon: Rp%.2f \n", harga_belum_diskon);
        System.out.printf("Total Diskon: Rp%.2f \n", total_diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", harga_sudah_diskon);
        System.out.println();
    }

}
