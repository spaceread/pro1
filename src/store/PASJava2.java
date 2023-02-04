package store;

import java.util.ArrayList;
import java.util.Scanner;

public class PASJava2 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int result, numbers1, numbers2,numbers3,numbers4,numbers5, choice;
                String user, pass, inputdata;
                System.out.print("Username : ");
                user = input.nextLine();
                System.out.print("Password : ");
                pass = input.nextLine();
                if (user.equals("Admin") && (pass.equals("Admin"))) {
                    System.out.println("Toko Kelontong 10 PPLG 2");
                } else {
                    System.out.println("Coba Lagi / Keluar Dari Program");
                    // System.exit(0);
                }
                System.out.print("1. Input Barang : ");
                inputdata = input.nextLine();
                System.out.print("2. List Barang :1. beras 2. telur 3. minyak 4.bawang 5. garam");
                inputdata = input.nextLine();
                System.out.print("3. Transaksi Barang : ");
                System.out.println("Masukan Operasi: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Nama Barang : ");
                        inputdata = input.nextLine();
                        System.out.print("Kode Barang : ");
                        inputdata = input.nextLine();
                        System.out.print("Jenis Barang : ");
                        inputdata = input.nextLine();
                        System.out.print("Jumlah Barang : ");
                        inputdata = input.nextLine();
                        System.out.print("Harga Barang : ");
                        inputdata = input.nextLine();
                        if (inputdata.equals("beras")){
                            numbers1 = 10000;
                        }
                        if (inputdata.equals("telur")){
                        numbers2 = 20000;
                        }
                        if (inputdata.equals("minyak")){
                            numbers3 = 20000;
                        }
                        if (inputdata.equals("bawang")){
                            numbers4 = 20000;
                        }
                        if (inputdata.equals("garam")){
                            numbers5 = 10000;
                        } else{
                            System.out.println("data tidak ada/kosong");
                            return;
                        }
                        result = numbers1 + numbers2 + numbers3 + numbers4 + numbers5;


                        break;
                    case 2:
                        ArrayList<databarang> databarang = new ArrayList<>();

                        databarang beras = new databarang();
                        beras.setName("Beras");
                        beras.setKode("01");
                        beras.setJenis("Beras");
                        beras.setJumlah(1);
                        beras.setharga(10000);
                        System.out.println("Nama Barang : "+ beras.getName());
                        System.out.println("Kode Barang : "+ beras.getKode());
                        System.out.println("Jenis Barang : "+ beras.getJenis());
                        System.out.println("Jumlah Barang : "+ beras.getJumlah());
                        System.out.println("Harga Barang :  "+ beras.getHarga());
                        System.out.println("-----------");

                        databarang telur = new databarang();
                        telur.setNama("Telur");
                        telur.setKode("02");
                        telur.setJenis("Telur");
                        telur.setJumlah(10);
                        telur.setHarga(20000);
                        System.out.println("Nama Barang : "+ telur.getNama());
                        System.out.println("Kode Barang : "+ telur.getKode());
                        System.out.println("Jenis Barang : "+ telur.getJenis());
                        System.out.println("Jumlah Barang : "+ telur.getJumlah());
                        System.out.println("Harga Barang :  "+ telur.getHarga());
                        System.out.println("-----------");

                        databarang minyak = new databarang();
                        minyak.setNama("Minyak Goreng");
                        minyak.setKode("03");
                        minyak.setJenis("Minyak");
                        minyak.setJumlah(1);
                        minyak.setHarga(20000);
                        System.out.println("Nama Barang : "+ minyak.getNama());
                        System.out.println("Kode Barang : "+ minyak.getKode());
                        System.out.println("Jenis Barang : "+ minyak.getJenis());
                        System.out.println("Jumlah Barang : "+ minyak.getJumlah());
                        System.out.println("Harga Barang :  "+ minyak.getHarga());
                        System.out.println("-----------");

                        databarang bawang = new databarang();
                        bawang.setNama("Bawang");
                        bawang.setKode("04");
                        bawang.setJenis("Bawang");
                        bawang.setJumlah(10);
                        bawang.setHarga(20000);
                        System.out.println("Nama Barang : "+ bawang.getNama());
                        System.out.println("Kode Barang : "+ bawang.getKode());
                        System.out.println("Jenis Barang : "+ bawang.getJenis());
                        System.out.println("Jumlah Barang : "+ bawang.getJumlah());
                        System.out.println("Harga Barang :  "+ bawang.getHarga());
                        System.out.println("-----------");

                        databarang garam = new databarang();
                        garam.setNama("Garam");
                        garam.setKode("05");
                        garam.setJenis("Garam");
                        garam.setJumlah(1);
                        garam.setHarga(10000);
                        System.out.println("Nama Barang : "+ garam.getNama());
                        System.out.println("Kode Barang : "+ garam.getKode());
                        System.out.println("Jenis Barang : "+ garam.getJenis());
                        System.out.println("Jumlah Barang : "+ garam.getJumlah());
                        System.out.println("Harga Barang :  "+ garam.getHarga());
                        System.out.println("-----------");
                        break;

                    case 3:
                        System.out.println("total anda adalah :" + result);
                        System.out.println("masukan bayaran :");
                        input.nextInt();
                        if (result < inputdata){
                            System.out.println("terima kasih untuk membeli");
                        }else{
                            System.out.println("uang anda tidak cukup");
                        }
                        break;


                }

            } }