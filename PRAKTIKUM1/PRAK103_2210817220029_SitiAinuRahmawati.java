package PRAKTIKUM1;
import java.util.Scanner;

public class PRAK103_2210817220029_SitiAinuRahmawati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang = input.nextInt();
        int awal = input.nextInt() - 1;
        int i = 0;
        do {
            awal++;
            if (awal % 2 != 0){
                System.out.print(awal);
                i++;
            } else {
                continue;
            } if (i != panjang) {
                System.out.print(", ");
            }
        } while (i < panjang);
    }
}
