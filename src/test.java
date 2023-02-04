import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int i;
        String  siswa = null;
        Scanner input = new Scanner(System.in);
        System.out.print("berapa orang hadir: ");
        i = input.nextInt();

        String[] jumlah = new String[i];

        for (String orang: jumlah) {
            System.out.println("yang hadir adalah: ");
            siswa = input.next();
        }
        switch (siswa) {


            case "pasha":
                break;

            case "vicko":
                break;

            case "dafa":
                break;

            case "radya":
                break;

            case "barata":
                break;

            default:
                System.out.println("siapa itu");
                break;
        }
    }
}
