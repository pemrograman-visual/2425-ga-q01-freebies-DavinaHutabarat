// 12S24047- Davina Olivia Yosefanny Hutabarat
// 12S24050 -Ester Hasianna Nainggolan

import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargaBuku, jumlahBuku, hargaPalingKecil, totalTransaksi, transaksiAkhir, totalHarga;

        hargaBuku = Double.parseDouble(input.nextLine());
        totalHarga = hargaBuku;
        hargaPalingKecil = hargaBuku;
        while (hargaBuku != 0) {
            if (hargaPalingKecil < hargaBuku) {
                hargaPalingKecil = hargaPalingKecil;
            } else {
                hargaPalingKecil = hargaBuku;
            }
            hargaBuku = Double.parseDouble(input.nextLine());
            totalHarga = totalHarga + hargaBuku;
        }
        if (totalHarga >= 100) {
            totalTransaksi = totalHarga - hargaPalingKecil;
        } else {
            totalTransaksi = totalHarga;
        }
        System.out.println(toFixed(totalTransaksi,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
