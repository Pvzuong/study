import java.util.Scanner;

public class qLySinhVien {

    public static float diemUuTien(String khuVuc, int doiTuong){

        float diemUuTien = 0f;

        switch (khuVuc) {
            case "A":
                diemUuTien += 2;
                break;
            case "B":
                diemUuTien += 1.0;
                break;
            case "C":
                diemUuTien += 0.5;
                break;
            default:
                break;
        }
        switch (doiTuong) {
            case 1:
                diemUuTien += 2.5;
                break;
            case 2:
                diemUuTien += 1.5;
                break;
            case 3:
                diemUuTien += 1;
                break;
            default:
                break;
        }
        return diemUuTien;
    }
    public static void main(String[] args) {
        float dMon1=0f, dMon2=0f, dMon3 = 0f, dChuan=0f;
        int dTuong = 0;
        String khuVuc =  new String();
        //Scanner scan = new Scanner(System.in);
        // input(dMon, dChuan, dTuong, khuVuc);
        Scanner scan = new Scanner(System.in);
        //diem cua ca nhan
        System.out.println("Moi ban nhap diem mon thu nhat:");
        dMon1 = scan.nextFloat();
        System.out.println("Moi ban nhap diem mon thu hai:");
        dMon2 = scan.nextFloat();
        System.out.println("Moi ban nhap diem mon thu ba:");
        dMon3 = scan.nextFloat();
        //Nhap khu vuc va doi tuong uu tien
            System.out.println("Nhap khu vuc cua thi sinh: \nA. Khu vuc A\nB. Khu vuc B\nC. Khu vuc C\nX. Khong co khu vuc");
            khuVuc = scan.next();

            System.out.println("Nhap doi tuong cua thi sinh: \n1. Doi tuong 1\n2. Doi tuong 2\n3. Doi tuong 3\n0. Khong co doi tuong");
            dTuong = scan.nextInt();
    
        System.out.println("Moi ban nhap diem chuan: ");
        dChuan = scan.nextFloat();
        scan.close();
        if (dMon1 == 0 || dMon2 ==0 || dMon3 == 0)
        {
            System.out.println("Ban bi rot vi co mon 0 diem");
        }
        float dTong = dMon1 + dMon2+ dMon3 + diemUuTien(khuVuc, dTuong);
        if (dTong >= dChuan)
            System.out.println("Ban da dau voi so diem: "+dTong);
        else
            System.out.println("Ban da rot voi so diem: "+dTong);

    }
}
