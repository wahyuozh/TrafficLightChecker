/*NAMA : WAHYU OZORAH MANURUNG
NPM: G1A022060
KELAS B2
*/
package TrafficLightChecker.java; //PACKAGE

import java.util.Scanner; //memanggil impor package yang membaca masukan pengguna
public class Tugas2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);//membca teks yang dimasukan pengguna
        System.out.println ("Enter a color code:"); //pengguna memasukan data
        int code = input.nextInt() ; //menyimpan masukan pengguna ke tipe data
        
        if (code==1) //memeriksa kondisi 1
            System.out.println ("Next Traffic Light is green"); //jika memenuhi maka akan diesekusi bagian ini
        else if (code ==2) //memeriksa kondisi 2
            System.out.println ("Next Traffic Light is Yellow"); //jika memenuhi maka akan diesekusi bagian ini
        else if(code==3) //memeriksa kondisi 3
                System.out.println ("Next Traffic Light is red"); //jika memenuhi maka akan diesekusi bagian ini
        else //jika tidak memenuhi maka akan diesekusi bagian ini
        System.out.println("invalid color");
                
            
            
    
    }
    
}

