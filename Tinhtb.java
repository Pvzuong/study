import java.util.Scanner;

/**
 * Tinhtb
 */
public class Tinhtb {

    public static void main(String[] args) {
        int i=1;
        int ketqua=0;
        Scanner scan = new Scanner(System.in);
        while (i<=5) {
            System.out.println("Nhap so thu " + i + ":");
            i++;
            ketqua += scan.nextInt();
        }
        System.out.println("Trung bình của 5 số là: " + ketqua/5);
        
    }
}