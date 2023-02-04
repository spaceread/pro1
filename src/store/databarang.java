package store;

public class databarang {

    public class barang {
        private String nama;
        private String kode;
        private String jenis;
        private int jumlah;
        private int getHarga;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getKode() {
            return kode;
        }

        public void setKode(String kode) {
            this.kode = kode;
        }

        public String getJenis() {
            return jenis;
        }

        public void setJenis(String jenis) {
            this.jenis = jenis;
        }

        public int getJumlah() {
            return jumlah;
        }

        public void setJumlah(int jumlah) {
            this.jumlah = jumlah;
        }

        public int getGetHarga() {
            return getHarga;
        }

        public void setGetHarga(int getHarga) {
            this.getHarga = getHarga;
        }
    }
}
