package MODUL1;
package Scanner;

public class PRAK101_2210817220029_SitiAinurRahmawati {
    public static void main(String[] args) {
        int input, i, j, input2;
        int[] arr;
        arr = new int[10];
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        scanner.close();

        for(i = input; i>0; i--) {
            input2 = scan.nextInt();
            scanner.close();
            int jumlah1 = 0, jumlah2 = 0;
            for(j = input2; j>0; j--) {
                jumlah1 = scan.nextInt();
                scanner.close();
                jumlah2 = jumlah2 + jumlah1;
            }
            if(jumlah%input2 == 0){
                arr [i] = 0;
            } else {
                arr [i] = 1;
            }
        }
        for(i = 1; i<= input)
    }
}
