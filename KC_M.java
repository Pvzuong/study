import java.util.Scanner;


public class KC_M {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* khai bao bien
        Xc toa do x cua duong tron
        Yc toa do Y cua duong tron        
        Xm toa do x cua M
        Ym toa do Y cua M
        R ban kinh cua duong tron
        */
        float Xc, Xm, Yc, Ym, R;


        // khai bao va nhap
        System.out.println("Nhap toa do X cua hinh tron :");
        Xc = scan.nextFloat();
        System.out.println("Nhap toa do y cua hinh tron :");
        Yc = scan.nextFloat();
        System.out.println("Nhap toa do X cua M :");
        Xm = scan.nextFloat();
        System.out.println("Nhap toa do y cua M :");
        Ym = scan.nextFloat();
        System.out.println("Nhap ban kinh R cua hinh tron :");
        R = scan.nextFloat();

        // tinh toan giai thuat 
        double Kc = Math.sqrt( Math.pow(Xm-Xc, 2.0) + Math.pow(Ym-Yc, 2.0)) ;
    

         if (Kc > R) {
            double ketqua= Kc - R;
            System.out.printf("M nam ngoai duong tron va cach duong tron :%.2f%n", ketqua);
           // System.out.printf("M nam ngoai duong tron va cach duong tron :%d%n", ketqua);            
         }
        else
        {
            double ketqua= R - Kc;
            System.out.printf("M nam trong duong tron va cach duong tron :%.2f%n", ketqua);
            //System.out.printf("M nam trong duong tron va cach duong tron :%d%n",  );
        }
            
}
}
 