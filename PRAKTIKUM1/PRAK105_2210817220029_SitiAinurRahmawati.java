package PRAKTIKUM1;
import java.util.Scanner;

public class PRAK105_2210817220029_SitiAinurRahmawati {
    static final double phi = 3.14;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double jari = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        System.out.print("Volume tabung dengan jari-jari " + jari + " cm dan tinggi "
                + tinggi + " cm adalah " + String.format("%.3f", phi*jari*jari*tinggi) + " m3");
    }
}
