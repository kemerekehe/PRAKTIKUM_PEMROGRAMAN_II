package PRAKTIKUM1;
import java.time.Month;
import java.util.Scanner;
import java.util.Date;
import java.text.*;
public class tes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();
        String month = Month.of(bulan).name();
        System.out.print(month.substring(0, 1) + month.substring(1,month.length()).toLowerCase());
    }
}
