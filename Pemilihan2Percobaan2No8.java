import java.util.Scanner;

public class Pemilihan2Percobaan2No8 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Mauskkan Sudut pertama segitiga anda = ");
        sudut1 = input08.nextFloat();
        System.out.print("Mauskkan Sudut kedua segitiga anda = ");
        sudut2 = input08.nextFloat();
        System.out.print("Mauskkan Sudut ketiga segitiga anda = ");
        sudut3 = input08.nextFloat();

        // total sudut
        totalSudut = sudut1 + sudut2 + sudut3;
        System.out.println("total sudut anda segitiga = " + totalSudut);

        if (totalSudut == 180) {
            if ((sudut1 == 60) || (sudut2 == 60) || (sudut3 == 60)) {
                System.out.println("merupakan segitiga siku-siku");
            } else {
                System.out.println("bukan segitiga siku-siku");
            }
            
        } else {
            System.out.println("bukan segitiga");
        }
    }
}
