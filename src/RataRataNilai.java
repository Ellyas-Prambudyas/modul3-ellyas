
import java.util.Scanner;

public class RataRataNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan-jumlah-mata-kuliah :");
        int n = input.nextInt(); // jumlah mata kuliah
        double[] nilai = new double[n]; // array untuk menyimpan nilai
        double total = 0; // variabel untuk menyimpan total nilai
        // input nilai dari user
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + (i+1) + ": ");
            nilai[i] = input.nextDouble();
            total += nilai[i]; // menambahkan nilai ke total
        }


        // menghitung rata-rata
        double rata = total / n;

        // menampilkan hasil
        System.out.println("Rata-rata nilai: " + rata);
    }
}
