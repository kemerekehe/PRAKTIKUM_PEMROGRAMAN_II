package soal1;
import java.util.Scanner;
public class HewanPeliharaan {
    private String nama;
    private String ras;
    public HewanPeliharaan(String n, String r) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
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
    }
}
