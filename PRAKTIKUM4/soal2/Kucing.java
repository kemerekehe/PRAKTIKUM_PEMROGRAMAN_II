package soal2;

import java.util.Scanner;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;
    public Kucing (String n, String r, String w) {
        super(n, r);
        Scanner input = new Scanner(System.in);
        System.out.print("Warna Bulu : ");
        w = input.nextLine();
        this.warnaBulu = w;
    }
    public void display() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}
