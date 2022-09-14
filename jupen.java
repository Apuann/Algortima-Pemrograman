import java.util.Scanner;
public class jupen {
    public static void main(String[] args) {
        String nama;
        int nilai;

        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Nama: ");
        nama = scan.next();
        System.out.println("Masukan Nilai: ");
        nilai = scan.nextInt();

        if (nilai >= 60) {
            System.out.println(nama+" Lulus");
        } else {
            System.out.println(nama+" Tidak Lulus");
        }
    }
}
