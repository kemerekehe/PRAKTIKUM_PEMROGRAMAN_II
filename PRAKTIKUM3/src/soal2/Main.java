package soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        LinkedList<Negara> ListNegara = new LinkedList<>();
        for (int i = 0; i < input; i++){
            Negara country = new Negara();
            ListNegara.add(country);
        }
        for (Negara value : ListNegara) {
            value.deskripsi();
        }
    }
}
