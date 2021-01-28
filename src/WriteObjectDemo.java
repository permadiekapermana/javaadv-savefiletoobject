import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectDemo {
    public static void main(String[] args){
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Mardia Netti");
        mahasiswa.setAlamat("Bandung");
        mahasiswa.setJenisKelamin("Perempuan");
        mahasiswa.setFakultas("Ilmu Komputer");
        mahasiswa.setJurusan("Teknologi Informasi");
    
        try {
            FileOutputStream fos=new FileOutputStream("src/mahasiswa.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mahasiswa);
            oos.close();
            fos.close();
            System.out.println("Selesai");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
		    e.printStackTrace();
        }
        }

        
}
