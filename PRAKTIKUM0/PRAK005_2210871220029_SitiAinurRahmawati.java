import java.util.Scanner;
public class PRAK005_2210871220029_SitiAinurRahmawati {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Makanan Favorit: ");
        String makanan = scanner.nextLine();
        System.out.print("Masukkan Hobi: ");
        String hobi = scanner.nextLine();
        System.out.printf("Aku Suka Makan %s, dan Hobiku %s", makanan, hobi);
    }
}
