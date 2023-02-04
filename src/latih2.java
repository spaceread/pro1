import java.util.Scanner;

public class latih2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] food = new String[4];
     //   food[0] = "nas gor";
      //  food[1] = "mie";
     //   food[2] = "bakso";
     //   food[3] = "brwead";

     //   System.out.print("input index 0 : ");
     //  food[0] = input.nextLine();

      //  System.out.print("input index 1 : ");
      //  food[1] = input.nextLine();

     //   System.out.print("input index 2 : ");
      //  food[2] = input.nextLine();

      //  System.out.print("input index 3 : ");
      //  food[3] = input.nextLine();

        int i = 0;
        while (i < food.length) {
            System.out.println("maskukan makanan: ");
            food[i] = input.nextLine();
            i++;

        }

        for (String myfood: food) {
            System.out.println("my favfood is: " );
            input.nextLine();
        }

    }
}
