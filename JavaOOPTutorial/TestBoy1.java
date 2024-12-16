import java.util.Scanner;
public class TestBoy1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนปีที่เกิด = ");
        int yearStart = kb.nextInt();

        System.out.print("ป้อนปีปัจจุบัน = ");
        int yearNow = kb.nextInt();

        int ageYear = yearNow-yearStart;
        System.out.println("อายุ (ปี) = "+ageYear);

        if(yearNow%4==0){
            System.out.println("ปีนี้เป็นปีที่มี 29 วันในเดือน ก.พ.");
        }
        
    }
}
