import java.util.Scanner;

public class Pemilihan2Percobaan1No08 {
    public static void main(String[] args) {
        Scanner Input08 = new Scanner(System.in);
        
        int tahun;

        System.out.print("Masukkan tahun = ");
        tahun = Input08.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("tahun kabisat");  
        }else {
            System.out.println("Bukan tahun kabisat");
        }



        // if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
        //     System.out.println("Tahun kabisat");
        // } else {
        //     System.out.println("Bukan tahun kabisat");
        // }
    }
}