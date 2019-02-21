package cobacoding2;
import java.util.Scanner;
public class CobaCoding2 {
    public static void main(String[] args) {
        int jawaban;
        Scanner islanty = new Scanner(System.in);
        
        System.out.println("MASUKKAN NILAI ");
        jawaban = islanty.nextInt();
        
        if (jawaban > 75){
            System.out.println("lulus");
        }else {
            System.out.println("ulang");
        }
    
        
        
    }
    
}
