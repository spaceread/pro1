import java.util.Scanner;

public class newprojec {

    static Scanner input = new Scanner(System.in);

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

        System.out.print("Masukin Nama Anda : ");
        String nama = input.next();

        System.out.print("Masukin Password Anda : ");
        String password = input.next();

        System.out.println("=========================================================");

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
    char operator;
    Double number1, number2, result;
    private static void aritmatika() {

        int pilihan, awal, akhir;

        System.out.println("------------------------------------------------- ");
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN HANJIL & GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Pilihan [1. Ganjil] | [2. Genap] | [3. Kalkulator] : ");
        pilihan = input.nextInt();
        System.out.println("--------------------------- ");

        switch (pilihan) {
            case 1:
                System.out.print("Masukan Nilai Awal : ");
                awal = input.nextInt();
                System.out.print("Masukan Nilai Akhir : ");
                akhir = input.nextInt();
                System.out.println("Deret Bilangan Ganjil");
                for (int i = awal; i <= akhir; i++) {
                    if (i % 2 != 0)
                        System.out.print(i + " ");
                }
                break;
            case 2:
                System.out.print("Masukan Nilai Awal : ");
                awal = input.nextInt();
                System.out.print("Masukan Nilai Akhir : ");
                akhir = input.nextInt();
                System.out.println("Deret Bilangan Genap");
                for (int i = awal; i <= akhir; i++) {
                    if (i % 2 == 0)
                        System.out.print(i + " ");
                }
                break;
            case 3:
                char operator;
                Double number1, number2, result;

                Scanner input = new Scanner(System.in);
                //dialog
                System.out.println("Apa Operator: +, -, *, or /");
                operator = input.next().charAt(0);


                System.out.println("Pilihan pertama");
                number1 = input.nextDouble();

                System.out.println("Pilihan kedua");
                number2 = input.nextDouble();
                //operator


                switch (operator) {


                    case '+':
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;

                    case '-':
                        result = number1 - number2;
                        System.out.println(number1 + " - " + number2 + " = " + result);
                        break;

                    case '*':
                        result = number1 * number2;
                        System.out.println(number1 + " * " + number2 + " = " + result);
                        break;

                    case '/':
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                        break;

                    default:
                        System.out.println("operator apa itu?");
                        break;
                }
        }
        System.out.println("");
    }


    private static void LuasBangun() {

        System.out.println("--- Menghitung Luas Bangun Datar ---");
        System.out.println("[pilihan]");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang ");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan Pilihan Anda : ");

        int choice = input.nextInt();
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
        double alas,tinggi;
        System.out.print("Masukkan Nilai Alas:");
        alas = input.nextInt();
        System.out.print("Masukkan Nilai Tinggi:");
        tinggi = input.nextInt();
        double luas = (alas * tinggi)/2;
        System.out.println("Luas Segitiga: "+luas+"Cm²");
    }

    public static  void  Persegi() {
        int sisi,keliling,luas,menu;

        System.out.print("Masukkan Panjang Sisi Persegi: ");
        sisi = input.nextInt();
        luas = sisi * sisi;
        System.out.println("Hasil: "+luas+"Cm²");
    }
    public static void persegipanjang()
    {

        double p,l,luas,keliling;
        System.out.print("Masukkan Panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        l = input.nextDouble();
        //rumus
        luas = p*l;
        System.out.print("Luas  = " + (int)luas+" Cm²");
        System.out.print("");
    }

    public static void lingkaran()
    {

        double r, luas,keliling;
        double phi = 3.14;
        System.out.println("Rumus Keliling");
        System.out.print("Masukkan Jari-Jari : ");
        r = input.nextDouble();
        System.out.println("=>");
        luas = phi * r * r;
        System.out.print("Luas= " + luas+" Cm²");
        System.out.print("");
    }
    //===========================================================================
    private static void Kbangun() {

        System.out.println("--- Menghitung Keliling dan Bangun Datar ---");
        System.out.println("[pilihan]");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang ");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan Pilihan Anda : ");

        int choice = input.nextInt();
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

        int sisi1,sisi2,sisi3,keliling;
        System.out.print("Masukan Sisi 1:");
        sisi1= input.nextInt();
        System.out.print("Masukan Sisi 2:");
        sisi2= input.nextInt();
        System.out.print("Masukan Sisi 3:");
        sisi3= input.nextInt();
        keliling=sisi1+sisi2+sisi3;
        System.out.println("Keliling Segitiga:"+keliling+"Cm");
    }

    public static  void  Persegi1() {
        int sisi,keliling,luas,menu;
        System.out.print("Masukan Panjang Sisi Persegi:");
        sisi= input.nextInt();
        keliling=4*sisi;
        System.out.println("Hasil: "+keliling+"Cm");
    }
    public static void persegipanjang1()
    {

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

        double r, luas,keliling;
        double phi = 3.14;
        System.out.print("Masukkan Jari-Jari : ");
        r = input.nextDouble();
        System.out.println("=>");
        keliling = 2 * phi * r;
        System.out.print("Keliling = "+ keliling+" Cm");
        System.out.print("");
    }
}