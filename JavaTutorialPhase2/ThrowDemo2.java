import java.util.Scanner;
public class ThrowDemo2 {
    static int balance = 50000; // ประกาศให้เป็น global เพื่อให้ main หาตัวแปรนี้เจอ
    public static void main(String[] args) {
        try {     
            Scanner kb = new Scanner(System.in);
            System.out.print("ป้อนจำนวนเงินที่ต้องการถอน = ");
            int money = kb.nextInt();
            withDraw(money);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void withDraw(int amount) throws Exception {  //ถ้าต้องการให้โยนข้าม method เขียน throws Exception ต่อท้าย method เพราะ throw เฉยๆจะโยนภายใน method เดียวกัน
        if(amount<=0){
            throw new Exception("ป้อนจำนวนเงินที่มากกว่า 0");
        }
        if(amount>balance){
            throw new Exception("จำนวนเงินในบัญชีไม่เพียงพอ");
        }
        balance-=amount;
        System.out.println("จำนวนที่ถอน = "+ amount);
        System.out.println("ยอดเงินคงเหลือ = "+ balance);

    }
}
