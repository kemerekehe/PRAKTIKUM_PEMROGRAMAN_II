package soal3;

import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String nim;

    Scanner scan = new Scanner(System.in);
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }


    public Mahasiswa () {
        System.out.print("Masukkan Nama Mahasiswa: ");
        this.nama = scan.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        this.nim = scan.nextLine();
    }

}
