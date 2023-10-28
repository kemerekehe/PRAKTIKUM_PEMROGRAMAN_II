package soal1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dadu dadu = new Dadu();
        dadu.setOrang(scan.nextInt());
        dadu.acakNilai(dadu.getOrang());
    }
}
