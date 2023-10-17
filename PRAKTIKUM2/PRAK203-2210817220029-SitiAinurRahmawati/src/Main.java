public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // tidak ada titik koma dalam akhir baris ini
        // p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //variabel umur untuk objek p1 belum diinisiasi sehingga masih bernilai 0, maka perlu inisiasi terlebih dahulu
        p1.umur = 17;
        //untuk output agar sesuai dengan soal maka peru ditambahkan kata tahun setelah p1.umur dicetak
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
