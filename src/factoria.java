import java.util.Scanner;

public class factoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factor;
        int hasil = 1;
        System.out.print("masukan nomor factor: ");
        factor = input.nextInt();

        for (int i = 1; i <= factor; i++) {
            hasil = hasil * i;
            System.out.println(+ hasil);
        }

    }
}
