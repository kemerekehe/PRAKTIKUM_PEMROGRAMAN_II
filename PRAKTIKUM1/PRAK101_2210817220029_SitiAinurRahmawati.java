package PRAKTIKUM1;
import java.util.Scanner;
import java.time.Month;

public class PRAK101_2210817220029_SitiAinurRahmawati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempat = input.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        double berat = input.nextDouble();
        String month = Month.of(bulan).name();
        System.out.print("Nama Lengkap " + nama + ", Lahir di " + tempat + " pada " + tanggal + " " + month.charAt(0) + month.substring(1).toLowerCase() + " " + tahun + " Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");
    }
}
