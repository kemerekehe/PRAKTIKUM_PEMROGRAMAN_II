package soal2;

import java.util.Scanner;

public abstract class HewanPeliharaan {
    protected String nama;
    protected String ras;
    public HewanPeliharaan(String n, String r) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama hewan peliharaan: ");
        n = input.nextLine();
        this.nama = n;
        System.out.print("Ras : ");
        r = input.nextLine();
        this.ras = r;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    };
}
