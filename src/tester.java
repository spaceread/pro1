import java.util.Scanner;
public class tester {
    private static double HitungKelilingPersegi(double sisi) {

        //Rumus Luas Persegi =  4 * sisi

        double keliling = 4 * sisi;

        return keliling;

    }


    private static double HitungKelilingPersegiPanjang(double panjang, double lebar) {

        //Rumus Luas Persegi Panjang = panjang * lebar

        double keliling = 2 * (panjang + lebar);

        return keliling;

    }

    static double HitungKelilingSegitiga(double a, double b, double c) {

        //Rumus Keliling Segitiga = (a + b + c)

        double keliling = (a + b + c);

        return keliling;

    }

    private static double HitungKelilingLingkaran(double phi, double r) {

        //Rumus Keliling lingkaran = 2 * phi * r

        //phi bisa 22/7 dan 3.14

        double keliling = r * 2 * 3.14;


        return keliling;
    }


    static boolean CekValue(String value) {

        try {

            Integer.parseInt(value);

            return true;

        } catch (NumberFormatException ex) {

            return false;

        }

    }

    public static void main(String[] args) {

        //Pilihan untuk hitung luas

        Scanner input = new Scanner(System.in);


        System.out.println("Silahkan Keliling apa yang akan anda hitung !");

        System.out.println("A. Persegi");

        System.out.println("B. Persegi Panjang");

        System.out.println("C. Segitiga");

        System.out.println("D. Lingkaran");

        System.out.print("Masukan pilihan anda : ");

        String choise = input.nextLine();

        System.out.println("=================================================");

        switch (choise.toLowerCase()) {

            case "a":

                System.out.println("Menghitung Keliling Persegi");

                System.out.print("Masukan Nilai Sisi : ");

                String sisi = input.nextLine();

                if (CekValue(sisi)) {

                    double s = Integer.parseInt(sisi);

                    double keliling = HitungKelilingPersegi(s);

                    System.out.println("Keliling Persegi anda : " + keliling);

                } else {

                    System.out.println("Nilai yang anda masukan harus integer");

                }

                break;

            case "b":

                System.out.println("Menghitung Keliling Persegi Panjang");

                System.out.print("Masukan Nilai Panjang : ");

                String panjang = input.nextLine();

                System.out.print("Masukan Nilai Lebar : ");

                String lebar = input.nextLine();

                if (CekValue(panjang) && CekValue(lebar)) {

                    int p = Integer.parseInt(panjang);

                    int l = Integer.parseInt(lebar);

                    double keliling = HitungKelilingPersegiPanjang(p, l);

                    System.out.println("Keliling Persegi Panjang anda : " + keliling);

                } else {

                    System.out.println("Nilai yang anda masukan harus integer");

                }

                break;

            case "c":

                System.out.println("Menghitung Keliling Segitiga");

                System.out.print("Masukan Nilai Kiri : ");

                String kiri = input.nextLine();

                System.out.print("Masukan Nilai Kanan : ");

                String kanan = input.nextLine();

                System.out.print("Masukan Nilai Bawah : ");

                String bawah = input.nextLine();

                if(CekValue(kiri) && CekValue(kanan) && CekValue(bawah)){

                    int a = Integer.parseInt(kiri);

                    int k = Integer.parseInt(kanan);

                    int b = Integer.parseInt(bawah);

                    double keliling = HitungKelilingSegitiga(a,k,b);

                    System.out.println("Keliling Segitiga anda : "+keliling);

                }else{

                    System.out.println("Nilai yang anda masukan harus integer");

                }

                break;

            case "d":

                System.out.println("Menghitung Keliling Lingkaran");

                System.out.print("Masukan Nilai r : ");

                String jari = input.nextLine();

                if(CekValue(jari)){

                    int jr = Integer.parseInt(jari);

                    double keliling = HitungKelilingLingkaran(jr);

                    System.out.println("Keliling Lingkaran anda : "+keliling);

                }else{

                    System.out.println("Nilai yang anda masukan harus integer");

                }

                break;


            default:

                System.out.println("WARNING : Pilihan anda tidak terdaftar");

        }

        System.out.println("=================================================");
    }

    static double HitungKelilingLingkaran(int jr) {
        return 0;
    }
}
