package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> ListMahasiswa = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scan.nextInt();
            scan.nextLine();
            if (pilihan == 1) {
                Mahasiswa mhs = new Mahasiswa();
                ListMahasiswa.add(mhs);
                System.out.println("Mahasiswa " + mhs.getNama() + " ditambahkan.");
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String NIM = scan.nextLine();
                ListMahasiswa.removeIf(mhs -> mhs.getNim().equals(NIM));
                System.out.printf("Mahasiswa dengan NIM %s dihapus\n", NIM);

            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String diacri = scan.nextLine();
                for (Mahasiswa mhs: ListMahasiswa) {
                    if (mhs.getNim().equals(diacri)) {
                        System.out.println("Nama Mahasiswa: " + mhs.getNama());
                        System.out.printf("NIM Mahasiswa: %s\n", mhs.getNim());
                        break;
                    }
                }
            } else if (pilihan == 4) {
                System.out.println("Daftar Mahasiswa:");
                for (Mahasiswa mhs: ListMahasiswa) {
                    System.out.printf("NIM: %s, Nama: %s\n", mhs.getNim(), mhs.getNama());}
            } else if (pilihan == 0) {
                System.out.println("Terima Kasih!");
                break;
            }
        }
    }
}
