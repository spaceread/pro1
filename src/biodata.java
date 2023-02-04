import java.util.Scanner;

public class biodata {

    public static void main(String[] args) {

        Scanner alpha = new Scanner(System.in);
        //deklarasi input
        System.out.print("masukin nama anda : ");
        String nama = alpha.nextLine();

        System.out.print("masukin kelas anda : ");
        String kelas = alpha.nextLine();

        System.out.print("masukin jurusan anda : ");
        String jurusan = alpha.nextLine();

        System.out.print("masukin umur anda : ");
        int umur = alpha.nextInt();

        System.out.print("masukin hobby anda : ");
        String hobby = alpha.nextLine();

        System.out.println("nama :" + nama);
        System.out.println("kelas :" + kelas);
        System.out.println("jurusan :" + jurusan);
        System.out.println("umur :" + umur);
        System.out.println("hobby :" + hobby);
        if(umur < 17){
            System.out.println("belum boleh membuat sim");
        }else {
            System.out.println("bisa membuat sim");
        }
    }
}