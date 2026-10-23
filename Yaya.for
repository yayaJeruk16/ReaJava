
import java.util.Scanner;

public class soalfor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n  = in.nextInt();

        for(int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.println(i + ". Saya suka informatika");
            }else{
                System.out.println(i + ". Saya semangat ngoding");
            }
        }
    }
    
}
