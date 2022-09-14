import java.util.Scanner;
public class Penjumlahan {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan nilai X : ");
        x = scan.nextInt();
        System.out.println("Masukan nilai y : ");
        y = scan.nextInt();

        int hasil = x + y;

        System.out.println("Hasil dari x + y = " + hasil);
    }
}

