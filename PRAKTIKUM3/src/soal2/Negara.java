package soal2;

import java.util.HashMap;
import java.util.Scanner;

public class Negara {
    private String negara;
    private String nama;
    private String jenis_kepemimpinan;
    private int tanggal_kemerdekaan;
    private int bulan_kemerdekaan;
    private int tahun_kemerdekaan;

    HashMap<Integer, String> bulan = new HashMap<>();

    public Negara() {
        Scanner input = new Scanner(System.in);
        this.negara = input.nextLine();
        this.jenis_kepemimpinan = input.nextLine();
        this.nama = input.nextLine();
        if (jenis_kepemimpinan.equals("presiden") || jenis_kepemimpinan.equals("perdana menteri")) {
            this.tanggal_kemerdekaan = input.nextInt();
            this.bulan_kemerdekaan = input.nextInt();
            this.tahun_kemerdekaan = input.nextInt();
        }
    }
    public String bulan(int month){
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");
        return bulan.get(month);
    }
    public void deskripsi() {
            if (jenis_kepemimpinan.equals("presiden")) {
                System.out.printf("Negara %s mempunyai Presiden bernama %s\nDeklarasi Kemerdekaan pada Tanggal %d %s %d\n", negara, nama, tanggal_kemerdekaan, bulan(bulan_kemerdekaan), tahun_kemerdekaan);
            } else if (jenis_kepemimpinan.equals("perdana menteri")){
                System.out.printf("Negara %s mempunyai Perdana Menteri bernama %s\nDeklarasi Kemerdekaan pada Tanggal %d %s %d\n", negara, nama, tanggal_kemerdekaan, bulan(bulan_kemerdekaan), tahun_kemerdekaan);
            } else {
                System.out.printf("Negara %s mempunyai Raja bernama %s\n", negara, nama);
            }
        System.out.println();
    }
}
