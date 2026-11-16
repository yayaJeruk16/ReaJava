
import java.util.Scanner;

public class hihi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();

        System.out.print("Awal = " + n.substring(0,3) + ",");
        System.out.print(" Akhir = " + n.substring(n.length)-3);
    
        //awalnya mulai dri indeks 0 (p) sampai 3 (m)
        //akhirnya mulai dari indeks 8 (m) sampai 11 (n)
    }
}
