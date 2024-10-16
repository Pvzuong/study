import java.util.Scanner;

/**
 * usd_to_vnd
 */
public class usd_to_vnd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doi tien USD snag VND");
        System.out.println("Nhap so tien USD can doi: ");
        float usd= scan.nextFloat();
        System.out.println("So VND sau khi doi la: \t" + usd*23.5 + "vnd");
    }
}