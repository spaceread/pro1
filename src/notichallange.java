import java.util.Scanner;

public class notichallange {
    public static void main(String[] args) {
        int y;

        Scanner scan = new Scanner(System.in);
        System.out.print("berapa orang yang hadir: ");
        y = scan.nextInt();


        String[] hadir = new String[y];



        for (String orang: hadir) {
            System.out.println("yang hadir adalah: ");
            scan.nextLine();
        }

    }
}
`