public class Object {
    private String Nama;
    private double berat;
    private double harga;
    private double jumlah;
    private double harga_belum_diskon;
    private double total_diskon;
    private double harga_sudah_diskon;

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
        System.out.println("Nama Buah: " + Nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlah + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + harga_belum_diskon);
        System.out.println("Total Diskon: Rp" + total_diskon);
        System.out.println("Harga Setelah Diskon: Rp" + harga_sudah_diskon);
        System.out.println();
    }

}
