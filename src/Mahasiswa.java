import java.io.Serializable;

public class Mahasiswa implements Serializable {
    
        private static final long serialVersionUID = -8637239411569432504L;
		private String nama;
		private String alamat;
		private String jenisKelamin;
		private String fakultas;
		private String jurusan; 
	
        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public String getAlamat() {
            return alamat;
        }
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
        public String getJenisKelamin() {
            return jenisKelamin;
        }
        public void setJenisKelamin(String jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
        }
        public String getFakultas() {
            return fakultas;
        }
        public void setFakultas(String fakultas) {
            this.fakultas = fakultas;
        }
        public String getJurusan() {
            return jurusan;
        }
        public void setJurusan(String jurusan) {
            this.jurusan = jurusan;
        }
        public String toString(){
            return new StringBuffer("Mahasiswa {")
                    .append("Nama : ").append(this.nama)
                    .append("Alamat : ").append(this.alamat)
                    .append("Fakultas : ").append(this.fakultas)
                    .append("Jurusan : ").append(this.jurusan)
                    .toString(); 
        }   
    
}
