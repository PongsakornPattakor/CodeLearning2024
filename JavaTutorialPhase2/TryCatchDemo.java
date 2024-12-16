import java.util.Scanner;
public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        /* 
            try{
                ลองทำคำสั่งปกติก่อน
            }
            catch(Exception e){
                ถ้ามีข้อผิดพลาด ให้ทำคำสั่งนี้
            }
    
        */

        try {
            System.out.print("ป้อนตัวเลข = ");
            int num = kb.nextInt();
            System.out.println(num); //ลองทำคำสั่งนี้ 
        } catch (Exception e) {
            System.out.println("กรอกได้เฉพาะตัวเลขเท่านั้น"); //ถ้าโปรแกรมเกิดข้อผิดพลาดจะแสดงผลตามคำสั่งนี้
        } 
    
    }
}
