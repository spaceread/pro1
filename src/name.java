import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, alamat;
        System.out.print("masukan nama anda");
        nama = input.next();

        System.out.print("masukan alamat anda");
        alamat = input.next();

        cetakNama("Hannan Tikta Pasha", "jl.raya");
    }

    public static void cetakNama(String nama, String alamat) {
        System.out.print("nama: "+ nama);
        System.out.print("alamat: "+ alamat);
    }
}
