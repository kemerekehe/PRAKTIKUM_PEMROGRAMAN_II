package PRAKTIKUM1;
import java.util.Scanner;

public class PRAK102_2210817220029_SitiAinurRahmawati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int i = angka;
        while(true){
            if (angka % 5 == 0) {
                System.out.print(angka/5-1);
            } else {
                System.out.print(angka);
            }
            if ( angka == i + 10) {
                break;
            } else {
                System.out.print(", ");
            } angka++;
        }
    }
}
