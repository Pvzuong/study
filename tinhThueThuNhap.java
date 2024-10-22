import java.util.Scanner;


public class tinhThueThuNhap {

    // tinh tien chiu thue
    public static double tinhTienchiuthue (double thuNhapNam, int soNgPhuThuoc){
        final double tienGD = 1.6f, tienCN = 4f;
        double tienChiuThue = thuNhapNam - tienCN - soNgPhuThuoc * tienGD;
        return tienChiuThue;
    }
    //tinh thue phai nop
    public static double tienThueNop(double tienChiuThue){
        double tienThueNop = 0f;

        if ( tienChiuThue > 60){
            tienThueNop+= 60*0.05;
            if ( tienChiuThue > 120){
                tienThueNop+= (120-60)*0.1;
                if ( tienChiuThue > 210){
                    tienThueNop += (210-120)*0.15;
                    if (tienChiuThue > 384){
                        tienThueNop += (384-210)*0.2;
                        if (tienChiuThue > 624){
                            tienThueNop += (624-384)*0.25;
                            if (tienChiuThue > 960){
                                tienThueNop += (960-624)*0.3 + (tienChiuThue - 960)*0.35;
                            }
                            else
                            tienThueNop += (tienChiuThue - 624)*0.3;
                        }
                        else
                        tienThueNop += (tienChiuThue - 384)*0.25;   
                    }
                    else
                    tienThueNop += (tienChiuThue - 210)*0.2;
                }
                else
                tienThueNop += (tienChiuThue - 120)*0.15;
            }
            else 
            tienThueNop += (tienChiuThue - 60)*0.1;
        }
        else
        tienThueNop += tienChiuThue*0.05;
        return tienThueNop;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        double  thuNhapNam ;
        int soNgPhuThuoc;
        
        
        // Nhap cac thong tin can 
        System.out.println("Nhap ten nguoi nop thue:");     name = scan.nextLine();     
        System.out.println("Nhap so thu nhap ca nhan 1 nam:");      thuNhapNam = scan.nextDouble();
        System.out.println("Nhap vao so nguoi phu thuoc:");     soNgPhuThuoc = scan.nextInt();

        double tienChiuThue = tinhTienchiuthue(thuNhapNam, soNgPhuThuoc);

        // xuat 
        System.out.printf("So thue %s phai nop la: %.2f",name,tienThueNop(tienChiuThue));

        scan.close();
    }
}
