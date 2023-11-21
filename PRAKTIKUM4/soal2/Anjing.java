package soal2;

import java.util.Scanner;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String kemampuan[];
    public Anjing (String n, String r, String w, String k) {
        super(n, r);
        Scanner input = new Scanner(System.in);
        System.out.print("Warna Bulu : ");
        w = input.nextLine();
        this.warnaBulu = w;
        System.out.print("Kemampuan : ");
        this.kemampuan = (input.nextLine()).split(",");
    }
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.print("Memiliki kemampuan : ");
        for (String i : kemampuan) {
            System.out.print(i);
        }
    }
}
