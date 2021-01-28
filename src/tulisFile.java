import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
	 
public class tulisFile {
public static void main(String[] args) {
		FileOutputStream out = null ;
		String data = "Oke, Semangat PKL nya Rekan-Rekan" ;
        //buka file dari direktori
        try{
            // Sesuaikan direktori brkt sesuai dgn lokasi txt tmn2	        
            out = new FileOutputStream("src/bacalah.txt") ;
        }catch(FileNotFoundException e){
            System.out.println("File Tidak Ditemukan");
        }
        
// menulis
        try{
            for(int i = 0 ; i < data.length() ; i++){
                    //Konversi data
                    out.write((int)data.charAt(i));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
//tutup
        try{
            out.close();
        }catch(IOException e){
         
        }
}
}
