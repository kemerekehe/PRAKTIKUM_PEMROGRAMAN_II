package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Pilih jenis hewan yang ingin diinputkan:\n" +
                            "1 = Kucing\n" +
                            "2 = Anjing\n" +
                            "Masukkan pilihan: ");
        int pilihan = scn.nextInt();
        scn.nextLine();
        if (pilihan == 1) {
            Kucing cat = new Kucing(null, null, null);
            cat.display();
        }
        else if (pilihan == 2){
            Anjing dog = new Anjing(null, null, null, null);
            dog.display();
        }
    }
}
