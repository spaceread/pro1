import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        System.out.println("for");
        for (int i = 2; i <= 20; i++) {
            if (i % 2 != 0)
                System.out.println("ini genap");
            System.out.println("nomor: "+i);

        }
        System.out.println("ini genap");

        System.out.println("while");
        int i = 0;
        while (i <= 20){
            System.out.println("nomor: " + i);
            i++;
        }

        System.out.println("do while");
        int y = 0;
        do {
            System.out.println("nomor: " + y);
            y++;
        }while (y <= 20);

        System.out.println("a challenger approaches ");
        Scanner input = new Scanner(System.in);
        int   dasar, pangkat = 0;
        int result = 1;

        System.out.print("pilihan nom dasar: ");
        dasar = input.nextInt();

        System.out.print("Pilihan nom pangkat: ");
        pangkat = input.nextInt();

        for (int a = 1; i <= pangkat; i++) {
            result = result * pangkat;
        }
        System.out.print("" + result);
    }
}
