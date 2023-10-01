package PRAKTIKUM1;
import java.util.Scanner;
import java.lang.String;

public class PRAK104_2210817220209_SitiAinurRahmawati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String abu = input.nextLine();
        System.out.print("Tangan Bagas: ");
        String bagas = input.nextLine();
        int nilaiabu = 0, nilaibagas = 0;
        for(int i = 0; i <= 4; i += 2) {
            if(abu.charAt(i) == bagas.charAt(i)){
                continue;
            } else if(abu.charAt(i) == 'K' && bagas.charAt(i) == 'B'){
                nilaiabu++;
                continue;
            } else if (abu.charAt(i) < bagas.charAt(i)){
                nilaiabu++;
                continue;
            } nilaibagas++;
        } if (nilaiabu == nilaibagas) {
            System.out.print("Seri");
        } else if (nilaiabu > nilaibagas) {
            System.out.print("Abu");
        } else {
            System.out.print("Bagas");
        }

    }
}
