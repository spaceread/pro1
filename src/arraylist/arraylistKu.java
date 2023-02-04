package arraylist;

import sun.awt.util.IdentityArrayList;

import java.util.ArrayList;

public class arraylistKu {
    ArrayList<Siswa> myStudents = new ArrayList<>();
    Siswa budi = new Siswa();
//    public void setBudi(Siswa budi) {
//        this.budi = budi;
//        budi.setNama("Budi");
//        budi.setAbsen("2");
//        budi.setNis("007");
//        budi.setGmail("budi@gmail.com");
//        budi.setNoWa("12345678");
//        myStudents.add(budi);

//    }
    Siswa pasha = new Siswa();
    public void setPasha(Siswa pasha) {
        this.pasha = pasha;
        pasha.setNama("pasha");
        pasha.setAbsen("17");
        pasha.setNis("007");
        pasha.setGmail("hannan@gmail.com");
        pasha.setNoWa("08226043191");
        myStudents.add(pasha);
        for (int i = 0; i < myStudents.size(); i++) {
            Siswa siswaKu = myStudents.get(i);
            System.out.println("student name :" +siswaKu.getNama());
            System.out.println("student name :" +siswaKu.getAbsen());
            System.out.println("student name :" +siswaKu.getNis());
            System.out.println("student name :" +siswaKu.getGmail());
            System.out.println("student name :" +siswaKu.getNoWa());
        }
    }

}
