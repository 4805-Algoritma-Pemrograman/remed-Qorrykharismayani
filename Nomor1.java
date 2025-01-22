import java.util.Scanner;

public class Nomer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print ("Masukan total kilometer: ");
        int totalKm = scanner.nextInt();

        double honorTaksi;
        if (totalKm <=3) {
            honorTaksi = 20000.0; 
        } else {
            honorTaksi = 20000.0 + (totalKm - 3) * 10000.0;
        }
        System.out.println("Total KM: " + totalKm);
        System.out.println("Honor Taksi: " + honorTaksi);

       scanner.close();
       
    }
}
