package soal1;

import java.util.LinkedList;
import java.util.Random;

public class Dadu {

    private int orang;

    public void setOrang(int orang) {
        this.orang = orang;
    }

    public int getOrang() {
        return orang;
    }

    LinkedList<Integer> Nilai = new LinkedList<>();
    Random rand = new Random();
    public void acakNilai(int orang) {
        int Total = 0;
        for (int i = 0; i < orang; i++){
            int nilai = rand.nextInt(6) + 1;
            System.out.printf("Dadu ke-%d bernilai %d%n", i + 1, nilai);
            Nilai.add(nilai);
            Total = Total + Nilai.get(i);
        }
        System.out.println("Total nilai dadu keseluruhan " + Total);
    }
}
