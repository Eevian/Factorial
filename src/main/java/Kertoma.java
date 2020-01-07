
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna luku:");
        int loppu = Integer.valueOf(lukija.nextLine());

        int i = 1;
        int summa = 1;
                 
        while (i <= loppu) {
         
            summa = summa * i; 
            i++;
        }
        System.out.println("Kertoma on" + summa);
    }
}
