import java.util.Scanner;

public class wombo {
    public static void main(String[] args) {

//            String  lagi = "Y" ;
//            while (lagi.equals("Y") ){
//
//
//                Scanner yesno = new Scanner (System.in);
//
//// Masukan program yang akan di ulang
//                choice();
//
//                System.out.print ("Apakah Ingin Mengulang Program..?(Y/N)");
//                lagi =yesno.nextLine().toUpperCase();
//            }

        Scanner input = new Scanner(System.in);
        System.out.print("Masukin Nama Anda : ");
        String nama = input.next();

        System.out.print("Masukin Password Anda : ");
        String password = input.next();

        System.out.println("=========================================================");

        if (nama.equals("admin")) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect Nama");
            System.exit(0);
        }
        if (password.equals("admin")) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect Password");
            System.exit(0);
        }
        System.out.println("=========================================================");

        int pilihan, awal, akhir;
        int luas;

        if (nama.equals("admin"))
            System.out.print("Pilih Operasi : ");
        System.out.print("1. Aritmatika, ");
        System.out.print("2. Luas bangun, ");
        System.out.print("3. Keliling bangun : ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                aritmatika();
                break;
            case 2:
                LuasBangun();
                break;
            case 3:
                Kbangun();
                break;

        }
//            pilihan = input.nextInt();

    }

    private static void aritmatika() {
        Scanner input = new Scanner(System.in);

        int pilihan, awal, akhir;

        System.out.println("------------------------------------------------- ");
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN HANJIL & GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Pilihan [1. Ganjil] | [2. Genap] : ");
        pilihan = input.nextInt();
        System.out.print("Masukan Nilai Awal : ");
        awal = input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir = input.nextInt();
        System.out.println("--------------------------- ");

        switch (pilihan) {
            case 1:
                System.out.println("Deret Bilangan Ganjil");
                for (int i = awal; i <= akhir; i++) {
                    if (i % 2 != 0)
                        System.out.print(i + " ");
                }
                break;
            case 2:
                System.out.println("Deret Bilangan Genap");
                for (int i = awal; i <= akhir; i++) {
                    if (i % 2 == 0)
                        System.out.print(i + " ");
                }
                break;
        }
        System.out.println("");
    }

    private static void LuasBangun() {
        Scanner s = new Scanner (System.in);
        System.out.println("--- Menghitung Luas Bangun Datar ---");
        System.out.println("\n[pilihan]");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang ");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan Pilihan Anda : ");

        int choice = s.nextInt();
        switch (choice){
            case 1:Segitiga();
                break;
            case 2:Persegi();
                break;
            case 3:persegipanjang();
                break;
            case 4:lingkaran();
            default:
                String s1 = "nomer yang anda masukkan salah";
                break;
        }
    }
    public static void Segitiga(){
        Scanner scan = new Scanner(System.in);
        double alas,tinggi;
        System.out.print("Masukkan Nilai Alas:");
        alas = scan.nextInt();
        System.out.print("Masukkan Nilai Tinggi:");
        tinggi = scan.nextInt();
        double luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga: "+luas+"Cm²");
    }

    public static  void  Persegi() {
        int sisi,keliling,luas,menu;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nMasukkan Panjang Sisi Persegi: ");
        sisi = scan.nextInt();
        luas = sisi * sisi;
        System.out.println("Hasil: "+luas+"Cm²");
    }
    public static void persegipanjang()
    {
        Scanner input = new Scanner(System.in);
        double p,l,luas,keliling;
        System.out.print("Masukkan Panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        l = input.nextDouble();
        //rumus
        luas = p*l;
        System.out.print("Luas  = " + (int)luas+" Cm²");
        System.out.print("\n");
    }

    public static void lingkaran()
    {
        Scanner input = new Scanner(System.in);
        double r, luas,keliling;
        double phi = 3.14;
        System.out.println("\nRumus Keliling");
        System.out.print("Masukkan Jari-Jari : ");
        r = input.nextDouble();
        System.out.println("=>");
        luas = phi * r * r;
        System.out.print("Luas= " + luas+" Cm²");
        System.out.print("\n");
    }
    private static void Kbangun() {
        Scanner s = new Scanner (System.in);
        System.out.println("--- Menghitung Keliling dan Bangun Datar ---");
        System.out.println("\n[pilihan]");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang ");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan Pilihan Anda : ");

        int choice = s.nextInt();
        switch (choice){
            case 1:Segitiga1();
                break;
            case 2:Persegi1();
                break;
            case 3:persegipanjang1();
                break;
            case 4:lingkaran1();
            default:
                String s1 = "nomer yang anda masukkan salah";
                break;
        }
    }
    public static void Segitiga1(){
        Scanner scan = new Scanner(System.in);
        int sisi1,sisi2,sisi3,keliling;
        System.out.print("Masukan Sisi 1:");
        sisi1= scan.nextInt();
        System.out.print("Masukan Sisi 2:");
        sisi2= scan.nextInt();
        System.out.print("Masukan Sisi 3:");
        sisi3= scan.nextInt();
        keliling=sisi1+sisi2+sisi3;
        System.out.println("Keliling Segitiga:"+keliling+"Cm");
    }

    public static  void  Persegi1() {
        int sisi,keliling,luas,menu;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Panjang Sisi Persegi:");
        sisi= scan.nextInt();
        keliling=4*sisi;
        System.out.println("Hasil: "+keliling+"Cm");
    }
    public static void persegipanjang1()
    {
        Scanner input = new Scanner(System.in);
        double p,l,luas,keliling;
        System.out.print("Masukkan Panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        l = input.nextDouble();
        keliling =  2*(p + l);
        System.out.print("Keliling  = "+ (int)keliling+" Cm");
    }

    public static void lingkaran1()
    {
        Scanner input = new Scanner(System.in);
        double r, luas,keliling;
        double phi = 3.14;
        System.out.print("Masukkan Jari-Jari : ");
        r = input.nextDouble();
        System.out.println("=>");
        keliling = 2 * phi * r;
        System.out.print("Keliling = "+ keliling+" Cm");
        System.out.print("\n");
    }
}

