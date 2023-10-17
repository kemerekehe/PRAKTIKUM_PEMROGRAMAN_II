//nama kelas tidak sesuai maka diubah dari employee menjadi Pegawai
//public class Employee {
public class Pegawai {
    public String nama;
    //tipe data tidak sesuai untuk menyimpan data asal maka diubah dari char menjadi string
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    // nilai variabel j tidak diketahui asal usulnya sehingga perlu dimasukkan ke dalam parameter dengan tipe data yang sesuai yaitu String
    // public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
